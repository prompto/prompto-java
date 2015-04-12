// Generated from EParser.g4 by ANTLR 4.5
package presto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EParser}.
 */
public interface EParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_category_declaration(@NotNull EParser.Enum_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_category_declaration(@NotNull EParser.Enum_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_native_declaration(@NotNull EParser.Enum_native_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_native_declaration(@NotNull EParser.Enum_native_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol(@NotNull EParser.Native_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol(@NotNull EParser.Native_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol(@NotNull EParser.Category_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol(@NotNull EParser.Category_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull EParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull EParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_category_declaration(@NotNull EParser.Concrete_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_category_declaration(@NotNull EParser.Concrete_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_category_declaration(@NotNull EParser.Singleton_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_category_declaration(@NotNull EParser.Singleton_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerivedList}
	 * labeled alternative in {@link EParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerivedList(@NotNull EParser.DerivedListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerivedList}
	 * labeled alternative in {@link EParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerivedList(@NotNull EParser.DerivedListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerivedListItem}
	 * labeled alternative in {@link EParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerivedListItem(@NotNull EParser.DerivedListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerivedListItem}
	 * labeled alternative in {@link EParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerivedListItem(@NotNull EParser.DerivedListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_method_declaration(@NotNull EParser.Operator_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_method_declaration(@NotNull EParser.Operator_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetter_method_declaration(@NotNull EParser.Setter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetter_method_declaration(@NotNull EParser.Setter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetter_method_declaration(@NotNull EParser.Getter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetter_method_declaration(@NotNull EParser.Getter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_declaration(@NotNull EParser.Native_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_declaration(@NotNull EParser.Native_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_resource_declaration(@NotNull EParser.Native_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_resource_declaration(@NotNull EParser.Native_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_mappings(@NotNull EParser.Native_category_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_mappings(@NotNull EParser.Native_category_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link EParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingList(@NotNull EParser.NativeCategoryMappingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link EParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingList(@NotNull EParser.NativeCategoryMappingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link EParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingListItem(@NotNull EParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link EParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingListItem(@NotNull EParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeList}
	 * labeled alternative in {@link EParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(@NotNull EParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeList}
	 * labeled alternative in {@link EParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(@NotNull EParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeListItem}
	 * labeled alternative in {@link EParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttributeListItem(@NotNull EParser.AttributeListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeListItem}
	 * labeled alternative in {@link EParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttributeListItem(@NotNull EParser.AttributeListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_method_declaration(@NotNull EParser.Abstract_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_method_declaration(@NotNull EParser.Abstract_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_method_declaration(@NotNull EParser.Concrete_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_method_declaration(@NotNull EParser.Concrete_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_method_declaration(@NotNull EParser.Native_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_method_declaration(@NotNull EParser.Native_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTest_method_declaration(@NotNull EParser.Test_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTest_method_declaration(@NotNull EParser.Test_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull EParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull EParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#full_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_argument_list(@NotNull EParser.Full_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#full_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_argument_list(@NotNull EParser.Full_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void enterTyped_argument(@NotNull EParser.Typed_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void exitTyped_argument(@NotNull EParser.Typed_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInstanceStatement(@NotNull EParser.AssignInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInstanceStatement(@NotNull EParser.AssignInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull EParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull EParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignTupleStatement(@NotNull EParser.AssignTupleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignTupleStatement(@NotNull EParser.AssignTupleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull EParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull EParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull EParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull EParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull EParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull EParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull EParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull EParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull EParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull EParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull EParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull EParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(@NotNull EParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(@NotNull EParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull EParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull EParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull EParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull EParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithResourceStatement(@NotNull EParser.WithResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithResourceStatement(@NotNull EParser.WithResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithSingletonStatement(@NotNull EParser.WithSingletonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithSingletonStatement(@NotNull EParser.WithSingletonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClosureStatement(@NotNull EParser.ClosureStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClosureStatement(@NotNull EParser.ClosureStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnresolvedWithArgsStatement}
	 * labeled alternative in {@link EParser#method_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnresolvedWithArgsStatement(@NotNull EParser.UnresolvedWithArgsStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnresolvedWithArgsStatement}
	 * labeled alternative in {@link EParser#method_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnresolvedWithArgsStatement(@NotNull EParser.UnresolvedWithArgsStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeStatement}
	 * labeled alternative in {@link EParser#method_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeStatement(@NotNull EParser.InvokeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeStatement}
	 * labeled alternative in {@link EParser#method_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeStatement(@NotNull EParser.InvokeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_resource_statement(@NotNull EParser.With_resource_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_resource_statement(@NotNull EParser.With_resource_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_singleton_statement(@NotNull EParser.With_singleton_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_singleton_statement(@NotNull EParser.With_singleton_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull EParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull EParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link EParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterAtomicSwitchCase(@NotNull EParser.AtomicSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link EParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitAtomicSwitchCase(@NotNull EParser.AtomicSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link EParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSwitchCase(@NotNull EParser.CollectionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link EParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSwitchCase(@NotNull EParser.CollectionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_statement(@NotNull EParser.For_each_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_statement(@NotNull EParser.For_each_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull EParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull EParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull EParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull EParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull EParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull EParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link EParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementList(@NotNull EParser.ElseIfStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link EParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementList(@NotNull EParser.ElseIfStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link EParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementListItem(@NotNull EParser.ElseIfStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link EParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementListItem(@NotNull EParser.ElseIfStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull EParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull EParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull EParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull EParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link EParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchAtomicStatement(@NotNull EParser.CatchAtomicStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link EParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchAtomicStatement(@NotNull EParser.CatchAtomicStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link EParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchCollectionStatement(@NotNull EParser.CatchCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link EParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchCollectionStatement(@NotNull EParser.CatchCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull EParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull EParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull EParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull EParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull EParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull EParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAnyExpression(@NotNull EParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAnyExpression(@NotNull EParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull EParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull EParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(@NotNull EParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(@NotNull EParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivideExpression(@NotNull EParser.IntDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivideExpression(@NotNull EParser.IntDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoughlyEqualsExpression(@NotNull EParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoughlyEqualsExpression(@NotNull EParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSortedExpression(@NotNull EParser.SortedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSortedExpression(@NotNull EParser.SortedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpression(@NotNull EParser.ContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpression(@NotNull EParser.ContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCodeExpression(@NotNull EParser.CodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCodeExpression(@NotNull EParser.CodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(@NotNull EParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(@NotNull EParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AmbiguousExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousExpression(@NotNull EParser.AmbiguousExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AmbiguousExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousExpression(@NotNull EParser.AmbiguousExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull EParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull EParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull EParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull EParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(@NotNull EParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(@NotNull EParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull EParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull EParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(@NotNull EParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(@NotNull EParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull EParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull EParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull EParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull EParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(@NotNull EParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(@NotNull EParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAllExpression(@NotNull EParser.NotContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAllExpression(@NotNull EParser.NotContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(@NotNull EParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(@NotNull EParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull EParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull EParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull EParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull EParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull EParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull EParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull EParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull EParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorExpression(@NotNull EParser.ConstructorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorExpression(@NotNull EParser.ConstructorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnresolvedExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnresolvedExpression(@NotNull EParser.UnresolvedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnresolvedExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnresolvedExpression(@NotNull EParser.UnresolvedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAllExpression(@NotNull EParser.ContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAllExpression(@NotNull EParser.ContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(@NotNull EParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(@NotNull EParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsExpression(@NotNull EParser.NotContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsExpression(@NotNull EParser.NotContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(@NotNull EParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(@NotNull EParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(@NotNull EParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(@NotNull EParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAnyExpression(@NotNull EParser.ContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAnyExpression(@NotNull EParser.ContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull EParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull EParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvocationExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInvocationExpression(@NotNull EParser.InvocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvocationExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInvocationExpression(@NotNull EParser.InvocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull EParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull EParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(@NotNull EParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(@NotNull EParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchExpression(@NotNull EParser.FetchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchExpression(@NotNull EParser.FetchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(@NotNull EParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(@NotNull EParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDocumentExpression(@NotNull EParser.DocumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDocumentExpression(@NotNull EParser.DocumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnresolvedSelector}
	 * labeled alternative in {@link EParser#unresolved_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnresolvedSelector(@NotNull EParser.UnresolvedSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnresolvedSelector}
	 * labeled alternative in {@link EParser#unresolved_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnresolvedSelector(@NotNull EParser.UnresolvedSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnresolvedIdentifier}
	 * labeled alternative in {@link EParser#unresolved_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnresolvedIdentifier(@NotNull EParser.UnresolvedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnresolvedIdentifier}
	 * labeled alternative in {@link EParser#unresolved_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnresolvedIdentifier(@NotNull EParser.UnresolvedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#unresolved_selector}.
	 * @param ctx the parse tree
	 */
	void enterUnresolved_selector(@NotNull EParser.Unresolved_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#unresolved_selector}.
	 * @param ctx the parse tree
	 */
	void exitUnresolved_selector(@NotNull EParser.Unresolved_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_expression(@NotNull EParser.Invocation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_expression(@NotNull EParser.Invocation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#invocation_trailer}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_trailer(@NotNull EParser.Invocation_trailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#invocation_trailer}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_trailer(@NotNull EParser.Invocation_trailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link EParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectableExpression(@NotNull EParser.SelectableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link EParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectableExpression(@NotNull EParser.SelectableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link EParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull EParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link EParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull EParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelector(@NotNull EParser.MemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelector(@NotNull EParser.MemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterSliceSelector(@NotNull EParser.SliceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitSliceSelector(@NotNull EParser.SliceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterItemSelector(@NotNull EParser.ItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link EParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitItemSelector(@NotNull EParser.ItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocument_expression(@NotNull EParser.Document_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocument_expression(@NotNull EParser.Document_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorFrom}
	 * labeled alternative in {@link EParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorFrom(@NotNull EParser.ConstructorFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorFrom}
	 * labeled alternative in {@link EParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorFrom(@NotNull EParser.ConstructorFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorNoFrom}
	 * labeled alternative in {@link EParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorNoFrom(@NotNull EParser.ConstructorNoFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorNoFrom}
	 * labeled alternative in {@link EParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorNoFrom(@NotNull EParser.ConstructorNoFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(@NotNull EParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(@NotNull EParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull EParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull EParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#ambiguous_expression}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguous_expression(@NotNull EParser.Ambiguous_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#ambiguous_expression}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguous_expression(@NotNull EParser.Ambiguous_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_expression(@NotNull EParser.Fetch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_expression(@NotNull EParser.Fetch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void enterSorted_expression(@NotNull EParser.Sorted_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void exitSorted_expression(@NotNull EParser.Sorted_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListExpression}
	 * labeled alternative in {@link EParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListExpression(@NotNull EParser.ArgumentAssignmentListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListExpression}
	 * labeled alternative in {@link EParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListExpression(@NotNull EParser.ArgumentAssignmentListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListNoExpression}
	 * labeled alternative in {@link EParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListNoExpression(@NotNull EParser.ArgumentAssignmentListNoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListNoExpression}
	 * labeled alternative in {@link EParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListNoExpression(@NotNull EParser.ArgumentAssignmentListNoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link EParser#with_argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentList(@NotNull EParser.ArgumentAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link EParser#with_argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentList(@NotNull EParser.ArgumentAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link EParser#with_argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListItem(@NotNull EParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link EParser#with_argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListItem(@NotNull EParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArgument_assignment(@NotNull EParser.Argument_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArgument_assignment(@NotNull EParser.Argument_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instance_statement(@NotNull EParser.Assign_instance_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instance_statement(@NotNull EParser.Assign_instance_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link EParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterMemberInstance(@NotNull EParser.MemberInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link EParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitMemberInstance(@NotNull EParser.MemberInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link EParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterItemInstance(@NotNull EParser.ItemInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link EParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitItemInstance(@NotNull EParser.ItemInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tuple_statement(@NotNull EParser.Assign_tuple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tuple_statement(@NotNull EParser.Assign_tuple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#lfs}.
	 * @param ctx the parse tree
	 */
	void enterLfs(@NotNull EParser.LfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#lfs}.
	 * @param ctx the parse tree
	 */
	void exitLfs(@NotNull EParser.LfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#lfp}.
	 * @param ctx the parse tree
	 */
	void enterLfp(@NotNull EParser.LfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#lfp}.
	 * @param ctx the parse tree
	 */
	void exitLfp(@NotNull EParser.LfpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(@NotNull EParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(@NotNull EParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#dedent}.
	 * @param ctx the parse tree
	 */
	void enterDedent(@NotNull EParser.DedentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#dedent}.
	 * @param ctx the parse tree
	 */
	void exitDedent(@NotNull EParser.DedentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(@NotNull EParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(@NotNull EParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link EParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFullDeclarationList(@NotNull EParser.FullDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link EParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFullDeclarationList(@NotNull EParser.FullDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link EParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationListItem(@NotNull EParser.DeclarationListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link EParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationListItem(@NotNull EParser.DeclarationListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link EParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull EParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link EParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull EParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(@NotNull EParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(@NotNull EParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCategoryDeclaration(@NotNull EParser.CategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCategoryDeclaration(@NotNull EParser.CategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterResourceDeclaration(@NotNull EParser.ResourceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitResourceDeclaration(@NotNull EParser.ResourceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull EParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull EParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull EParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link EParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull EParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(@NotNull EParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(@NotNull EParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link EParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumCategoryDeclaration(@NotNull EParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link EParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumCategoryDeclaration(@NotNull EParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link EParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumNativeDeclaration(@NotNull EParser.EnumNativeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link EParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumNativeDeclaration(@NotNull EParser.EnumNativeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link EParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolList(@NotNull EParser.NativeSymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link EParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolList(@NotNull EParser.NativeSymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link EParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolListItem(@NotNull EParser.NativeSymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link EParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolListItem(@NotNull EParser.NativeSymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link EParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolListItem(@NotNull EParser.CategorySymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link EParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolListItem(@NotNull EParser.CategorySymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link EParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolList(@NotNull EParser.CategorySymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link EParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolList(@NotNull EParser.CategorySymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link EParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolList(@NotNull EParser.SymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link EParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolList(@NotNull EParser.SymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link EParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolListItem(@NotNull EParser.SymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link EParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolListItem(@NotNull EParser.SymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingList(@NotNull EParser.MatchingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingList(@NotNull EParser.MatchingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingSet(@NotNull EParser.MatchingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingSet(@NotNull EParser.MatchingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingRange(@NotNull EParser.MatchingRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingRange(@NotNull EParser.MatchingRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingPattern(@NotNull EParser.MatchingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingPattern(@NotNull EParser.MatchingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingExpression(@NotNull EParser.MatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link EParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingExpression(@NotNull EParser.MatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull EParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull EParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(@NotNull EParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(@NotNull EParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link EParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueListItem(@NotNull EParser.ValueListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link EParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueListItem(@NotNull EParser.ValueListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link EParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull EParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link EParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull EParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void enterRange_literal(@NotNull EParser.Range_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void exitRange_literal(@NotNull EParser.Range_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull EParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull EParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(@NotNull EParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(@NotNull EParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterDictType(@NotNull EParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitDictType(@NotNull EParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull EParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link EParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull EParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link EParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(@NotNull EParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link EParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(@NotNull EParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link EParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryType(@NotNull EParser.CategoryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link EParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryType(@NotNull EParser.CategoryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull EParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull EParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull EParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull EParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(@NotNull EParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(@NotNull EParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull EParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull EParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(@NotNull EParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(@NotNull EParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull EParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull EParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(@NotNull EParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(@NotNull EParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(@NotNull EParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(@NotNull EParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterPeriodType(@NotNull EParser.PeriodTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitPeriodType(@NotNull EParser.PeriodTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCodeType(@NotNull EParser.CodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link EParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCodeType(@NotNull EParser.CodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#category_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_type(@NotNull EParser.Category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#category_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_type(@NotNull EParser.Category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#code_type}.
	 * @param ctx the parse tree
	 */
	void enterCode_type(@NotNull EParser.Code_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#code_type}.
	 * @param ctx the parse tree
	 */
	void exitCode_type(@NotNull EParser.Code_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#document_type}.
	 * @param ctx the parse tree
	 */
	void enterDocument_type(@NotNull EParser.Document_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#document_type}.
	 * @param ctx the parse tree
	 */
	void exitDocument_type(@NotNull EParser.Document_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteCategoryDeclaration(@NotNull EParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteCategoryDeclaration(@NotNull EParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryDeclaration(@NotNull EParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryDeclaration(@NotNull EParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingletonCategoryDeclaration(@NotNull EParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link EParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingletonCategoryDeclaration(@NotNull EParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link EParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierListItem(@NotNull EParser.TypeIdentifierListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link EParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierListItem(@NotNull EParser.TypeIdentifierListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link EParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierList(@NotNull EParser.TypeIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link EParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierList(@NotNull EParser.TypeIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link EParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodVariableIdentifier(@NotNull EParser.MethodVariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link EParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodVariableIdentifier(@NotNull EParser.MethodVariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link EParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeIdentifier(@NotNull EParser.MethodTypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link EParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeIdentifier(@NotNull EParser.MethodTypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull EParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull EParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull EParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull EParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbolIdentifier(@NotNull EParser.SymbolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link EParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbolIdentifier(@NotNull EParser.SymbolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull EParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull EParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull EParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull EParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_identifier(@NotNull EParser.Symbol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_identifier(@NotNull EParser.Symbol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link EParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListItem(@NotNull EParser.ArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link EParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListItem(@NotNull EParser.ArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link EParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull EParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link EParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull EParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link EParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterCodeArgument(@NotNull EParser.CodeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link EParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitCodeArgument(@NotNull EParser.CodeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link EParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArgument(@NotNull EParser.OperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link EParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArgument(@NotNull EParser.OperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link EParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(@NotNull EParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link EParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(@NotNull EParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link EParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgument(@NotNull EParser.TypedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link EParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgument(@NotNull EParser.TypedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(@NotNull EParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(@NotNull EParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void enterCode_argument(@NotNull EParser.Code_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void exitCode_argument(@NotNull EParser.Code_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link EParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryArgumentType(@NotNull EParser.CategoryArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link EParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryArgumentType(@NotNull EParser.CategoryArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link EParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyArgumentType(@NotNull EParser.AnyArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link EParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyArgumentType(@NotNull EParser.AnyArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(@NotNull EParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(@NotNull EParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyListType(@NotNull EParser.AnyListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyListType(@NotNull EParser.AnyListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyDictType(@NotNull EParser.AnyDictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link EParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyDictType(@NotNull EParser.AnyDictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link EParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodListItem(@NotNull EParser.CategoryMethodListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link EParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodListItem(@NotNull EParser.CategoryMethodListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link EParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodList(@NotNull EParser.CategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link EParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodList(@NotNull EParser.CategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetterMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetterMemberMethod(@NotNull EParser.SetterMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetterMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetterMemberMethod(@NotNull EParser.SetterMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterMemberMethod(@NotNull EParser.GetterMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterMemberMethod(@NotNull EParser.GetterMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMemberMethod(@NotNull EParser.ConcreteMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMemberMethod(@NotNull EParser.ConcreteMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMemberMethod(@NotNull EParser.AbstractMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMemberMethod(@NotNull EParser.AbstractMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMemberMethod(@NotNull EParser.OperatorMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMemberMethod}
	 * labeled alternative in {@link EParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMemberMethod(@NotNull EParser.OperatorMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaCategoryMapping(@NotNull EParser.JavaCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaCategoryMapping(@NotNull EParser.JavaCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCategoryMapping(@NotNull EParser.CSharpCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCategoryMapping(@NotNull EParser.CSharpCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython2CategoryMapping(@NotNull EParser.Python2CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython2CategoryMapping(@NotNull EParser.Python2CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython3CategoryMapping(@NotNull EParser.Python3CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython3CategoryMapping(@NotNull EParser.Python3CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptCategoryMapping(@NotNull EParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link EParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptCategoryMapping(@NotNull EParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython_category_mapping(@NotNull EParser.Python_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython_category_mapping(@NotNull EParser.Python_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_module}.
	 * @param ctx the parse tree
	 */
	void enterPython_module(@NotNull EParser.Python_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_module}.
	 * @param ctx the parse tree
	 */
	void exitPython_module(@NotNull EParser.Python_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#module_token}.
	 * @param ctx the parse tree
	 */
	void enterModule_token(@NotNull EParser.Module_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#module_token}.
	 * @param ctx the parse tree
	 */
	void exitModule_token(@NotNull EParser.Module_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_category_mapping(@NotNull EParser.Javascript_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_category_mapping(@NotNull EParser.Javascript_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_module(@NotNull EParser.Javascript_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_module(@NotNull EParser.Javascript_moduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link EParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(@NotNull EParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link EParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(@NotNull EParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link EParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableListItem(@NotNull EParser.VariableListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link EParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableListItem(@NotNull EParser.VariableListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethod(@NotNull EParser.AbstractMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethod(@NotNull EParser.AbstractMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMethod(@NotNull EParser.ConcreteMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMethod(@NotNull EParser.ConcreteMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeMethod(@NotNull EParser.NativeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeMethod(@NotNull EParser.NativeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTestMethod(@NotNull EParser.TestMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link EParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTestMethod(@NotNull EParser.TestMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link EParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementList(@NotNull EParser.NativeStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link EParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementList(@NotNull EParser.NativeStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link EParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementListItem(@NotNull EParser.NativeStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link EParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementListItem(@NotNull EParser.NativeStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaNativeStatement(@NotNull EParser.JavaNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaNativeStatement(@NotNull EParser.JavaNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpNativeStatement(@NotNull EParser.CSharpNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpNativeStatement(@NotNull EParser.CSharpNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython2NativeStatement(@NotNull EParser.Python2NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython2NativeStatement(@NotNull EParser.Python2NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython3NativeStatement(@NotNull EParser.Python3NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython3NativeStatement(@NotNull EParser.Python3NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptNativeStatement(@NotNull EParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link EParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptNativeStatement(@NotNull EParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython_native_statement(@NotNull EParser.Python_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython_native_statement(@NotNull EParser.Python_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_native_statement(@NotNull EParser.Javascript_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_native_statement(@NotNull EParser.Javascript_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link EParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementListItem(@NotNull EParser.StatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link EParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementListItem(@NotNull EParser.StatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link EParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull EParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link EParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull EParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link EParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionListItem(@NotNull EParser.AssertionListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link EParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionListItem(@NotNull EParser.AssertionListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link EParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionList(@NotNull EParser.AssertionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link EParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionList(@NotNull EParser.AssertionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link EParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementListItem(@NotNull EParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link EParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementListItem(@NotNull EParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link EParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementList(@NotNull EParser.SwitchCaseStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link EParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementList(@NotNull EParser.SwitchCaseStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link EParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementListItem(@NotNull EParser.CatchStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link EParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementListItem(@NotNull EParser.CatchStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link EParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementList(@NotNull EParser.CatchStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link EParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementList(@NotNull EParser.CatchStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRangeLiteral(@NotNull EParser.LiteralRangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRangeLiteral(@NotNull EParser.LiteralRangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListLiteral(@NotNull EParser.LiteralListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListLiteral(@NotNull EParser.LiteralListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSetLiteral(@NotNull EParser.LiteralSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link EParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSetLiteral(@NotNull EParser.LiteralSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMinIntegerLiteral(@NotNull EParser.MinIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMinIntegerLiteral(@NotNull EParser.MinIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMaxIntegerLiteral(@NotNull EParser.MaxIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMaxIntegerLiteral(@NotNull EParser.MaxIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull EParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull EParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull EParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull EParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(@NotNull EParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(@NotNull EParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull EParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull EParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(@NotNull EParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(@NotNull EParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(@NotNull EParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(@NotNull EParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull EParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull EParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(@NotNull EParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(@NotNull EParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull EParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull EParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterPeriodLiteral(@NotNull EParser.PeriodLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitPeriodLiteral(@NotNull EParser.PeriodLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull EParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link EParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull EParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link EParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(@NotNull EParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link EParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(@NotNull EParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link EParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListItem(@NotNull EParser.LiteralListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link EParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListItem(@NotNull EParser.LiteralListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull EParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull EParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull EParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull EParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull EParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull EParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull EParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link EParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull EParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expression(@NotNull EParser.This_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expression(@NotNull EParser.This_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(@NotNull EParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(@NotNull EParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link EParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLiteral(@NotNull EParser.AtomicLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link EParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLiteral(@NotNull EParser.AtomicLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link EParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull EParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link EParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull EParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(@NotNull EParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(@NotNull EParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(@NotNull EParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(@NotNull EParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(@NotNull EParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(@NotNull EParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(@NotNull EParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(@NotNull EParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteral(@NotNull EParser.TupleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link EParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteral(@NotNull EParser.TupleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(@NotNull EParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(@NotNull EParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(@NotNull EParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(@NotNull EParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link EParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTupleItem(@NotNull EParser.ValueTupleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link EParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTupleItem(@NotNull EParser.ValueTupleItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link EParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(@NotNull EParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link EParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(@NotNull EParser.ValueTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link EParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryList(@NotNull EParser.DictEntryListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link EParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryList(@NotNull EParser.DictEntryListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link EParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryListItem(@NotNull EParser.DictEntryListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link EParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryListItem(@NotNull EParser.DictEntryListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(@NotNull EParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(@NotNull EParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstAndLast(@NotNull EParser.SliceFirstAndLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstAndLast(@NotNull EParser.SliceFirstAndLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstOnly(@NotNull EParser.SliceFirstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstOnly(@NotNull EParser.SliceFirstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceLastOnly(@NotNull EParser.SliceLastOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link EParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceLastOnly(@NotNull EParser.SliceLastOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_statement(@NotNull EParser.Assign_variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_statement(@NotNull EParser.Assign_variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link EParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterRootInstance(@NotNull EParser.RootInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link EParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitRootInstance(@NotNull EParser.RootInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link EParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterChildInstance(@NotNull EParser.ChildInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link EParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitChildInstance(@NotNull EParser.ChildInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link EParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsATypeExpression(@NotNull EParser.IsATypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link EParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsATypeExpression(@NotNull EParser.IsATypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link EParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsOtherExpression(@NotNull EParser.IsOtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link EParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsOtherExpression(@NotNull EParser.IsOtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlus(@NotNull EParser.OperatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlus(@NotNull EParser.OperatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMinus(@NotNull EParser.OperatorMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMinus(@NotNull EParser.OperatorMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMultiply(@NotNull EParser.OperatorMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMultiply(@NotNull EParser.OperatorMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDivide(@NotNull EParser.OperatorDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDivide(@NotNull EParser.OperatorDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIDivide(@NotNull EParser.OperatorIDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIDivide(@NotNull EParser.OperatorIDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorModulo(@NotNull EParser.OperatorModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link EParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorModulo(@NotNull EParser.OperatorModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#key_token}.
	 * @param ctx the parse tree
	 */
	void enterKey_token(@NotNull EParser.Key_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#key_token}.
	 * @param ctx the parse tree
	 */
	void exitKey_token(@NotNull EParser.Key_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#value_token}.
	 * @param ctx the parse tree
	 */
	void enterValue_token(@NotNull EParser.Value_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#value_token}.
	 * @param ctx the parse tree
	 */
	void exitValue_token(@NotNull EParser.Value_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_token(@NotNull EParser.Symbols_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_token(@NotNull EParser.Symbols_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull EParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull EParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull EParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull EParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull EParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull EParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#idivide}.
	 * @param ctx the parse tree
	 */
	void enterIdivide(@NotNull EParser.IdivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#idivide}.
	 * @param ctx the parse tree
	 */
	void exitIdivide(@NotNull EParser.IdivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull EParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull EParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link EParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptReturnStatement(@NotNull EParser.JavascriptReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link EParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptReturnStatement(@NotNull EParser.JavascriptReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link EParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptStatement(@NotNull EParser.JavascriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link EParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptStatement(@NotNull EParser.JavascriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link EParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptPrimaryExpression(@NotNull EParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link EParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptPrimaryExpression(@NotNull EParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link EParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptSelectorExpression(@NotNull EParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link EParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptSelectorExpression(@NotNull EParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptParenthesisExpression(@NotNull EParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptParenthesisExpression(@NotNull EParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifierExpression(@NotNull EParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifierExpression(@NotNull EParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptLiteralExpression(@NotNull EParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link EParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptLiteralExpression(@NotNull EParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link EParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptMethodExpression(@NotNull EParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link EParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptMethodExpression(@NotNull EParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link EParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptItemExpression(@NotNull EParser.JavascriptItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link EParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptItemExpression(@NotNull EParser.JavascriptItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_method_expression(@NotNull EParser.Javascript_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_method_expression(@NotNull EParser.Javascript_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link EParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentListItem(@NotNull EParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link EParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentListItem(@NotNull EParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link EParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentList(@NotNull EParser.JavascriptArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link EParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentList(@NotNull EParser.JavascriptArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_item_expression(@NotNull EParser.Javascript_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_item_expression(@NotNull EParser.Javascript_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_parenthesis_expression(@NotNull EParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_parenthesis_expression(@NotNull EParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link EParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptChildIdentifier(@NotNull EParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link EParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptChildIdentifier(@NotNull EParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link EParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifier(@NotNull EParser.JavascriptIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link EParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifier(@NotNull EParser.JavascriptIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIntegerLiteral(@NotNull EParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIntegerLiteral(@NotNull EParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptDecimalLiteral(@NotNull EParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptDecimalLiteral(@NotNull EParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptTextLiteral(@NotNull EParser.JavascriptTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptTextLiteral(@NotNull EParser.JavascriptTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptBooleanLiteral(@NotNull EParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptBooleanLiteral(@NotNull EParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptCharacterLiteral(@NotNull EParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link EParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptCharacterLiteral(@NotNull EParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier(@NotNull EParser.Javascript_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier(@NotNull EParser.Javascript_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link EParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturnStatement(@NotNull EParser.PythonReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link EParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturnStatement(@NotNull EParser.PythonReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link EParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(@NotNull EParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link EParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(@NotNull EParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link EParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPrimaryExpression(@NotNull EParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link EParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPrimaryExpression(@NotNull EParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link EParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelectorExpression(@NotNull EParser.PythonSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link EParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelectorExpression(@NotNull EParser.PythonSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonParenthesisExpression(@NotNull EParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonParenthesisExpression(@NotNull EParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifierExpression(@NotNull EParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifierExpression(@NotNull EParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonLiteralExpression(@NotNull EParser.PythonLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonLiteralExpression(@NotNull EParser.PythonLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonGlobalMethodExpression(@NotNull EParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link EParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonGlobalMethodExpression(@NotNull EParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link EParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonMethodExpression(@NotNull EParser.PythonMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link EParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonMethodExpression(@NotNull EParser.PythonMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link EParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonItemExpression(@NotNull EParser.PythonItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link EParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonItemExpression(@NotNull EParser.PythonItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_method_expression(@NotNull EParser.Python_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_method_expression(@NotNull EParser.Python_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalOnlyArgumentList(@NotNull EParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalOnlyArgumentList(@NotNull EParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedOnlyArgumentList(@NotNull EParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedOnlyArgumentList(@NotNull EParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgumentList(@NotNull EParser.PythonArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link EParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgumentList(@NotNull EParser.PythonArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link EParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentListItem(@NotNull EParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link EParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentListItem(@NotNull EParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link EParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentList(@NotNull EParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link EParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentList(@NotNull EParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link EParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentListItem(@NotNull EParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link EParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentListItem(@NotNull EParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link EParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentList(@NotNull EParser.PythonNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link EParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentList(@NotNull EParser.PythonNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_parenthesis_expression(@NotNull EParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_parenthesis_expression(@NotNull EParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link EParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonChildIdentifier(@NotNull EParser.PythonChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link EParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonChildIdentifier(@NotNull EParser.PythonChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link EParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifier(@NotNull EParser.PythonIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link EParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifier(@NotNull EParser.PythonIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIntegerLiteral(@NotNull EParser.PythonIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIntegerLiteral(@NotNull EParser.PythonIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecimalLiteral(@NotNull EParser.PythonDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecimalLiteral(@NotNull EParser.PythonDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonTextLiteral(@NotNull EParser.PythonTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonTextLiteral(@NotNull EParser.PythonTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonBooleanLiteral(@NotNull EParser.PythonBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonBooleanLiteral(@NotNull EParser.PythonBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonCharacterLiteral(@NotNull EParser.PythonCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link EParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonCharacterLiteral(@NotNull EParser.PythonCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPython_identifier(@NotNull EParser.Python_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPython_identifier(@NotNull EParser.Python_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link EParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaReturnStatement(@NotNull EParser.JavaReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link EParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaReturnStatement(@NotNull EParser.JavaReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link EParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaStatement(@NotNull EParser.JavaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link EParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaStatement(@NotNull EParser.JavaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link EParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaPrimaryExpression(@NotNull EParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link EParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaPrimaryExpression(@NotNull EParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link EParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaSelectorExpression(@NotNull EParser.JavaSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link EParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaSelectorExpression(@NotNull EParser.JavaSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaParenthesisExpression(@NotNull EParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaParenthesisExpression(@NotNull EParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifierExpression(@NotNull EParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifierExpression(@NotNull EParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaLiteralExpression(@NotNull EParser.JavaLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link EParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaLiteralExpression(@NotNull EParser.JavaLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link EParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaMethodExpression(@NotNull EParser.JavaMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link EParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaMethodExpression(@NotNull EParser.JavaMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link EParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaItemExpression(@NotNull EParser.JavaItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link EParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaItemExpression(@NotNull EParser.JavaItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_method_expression(@NotNull EParser.Java_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_method_expression(@NotNull EParser.Java_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link EParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentList(@NotNull EParser.JavaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link EParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentList(@NotNull EParser.JavaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link EParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentListItem(@NotNull EParser.JavaArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link EParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentListItem(@NotNull EParser.JavaArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_item_expression(@NotNull EParser.Java_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_item_expression(@NotNull EParser.Java_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_parenthesis_expression(@NotNull EParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_parenthesis_expression(@NotNull EParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link EParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifier(@NotNull EParser.JavaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link EParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifier(@NotNull EParser.JavaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link EParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildIdentifier(@NotNull EParser.JavaChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link EParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildIdentifier(@NotNull EParser.JavaChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link EParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildClassIdentifier(@NotNull EParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link EParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildClassIdentifier(@NotNull EParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link EParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaClassIdentifier(@NotNull EParser.JavaClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link EParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaClassIdentifier(@NotNull EParser.JavaClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIntegerLiteral(@NotNull EParser.JavaIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIntegerLiteral(@NotNull EParser.JavaIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaDecimalLiteral(@NotNull EParser.JavaDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaDecimalLiteral(@NotNull EParser.JavaDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaTextLiteral(@NotNull EParser.JavaTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaTextLiteral(@NotNull EParser.JavaTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaBooleanLiteral(@NotNull EParser.JavaBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaBooleanLiteral(@NotNull EParser.JavaBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCharacterLiteral(@NotNull EParser.JavaCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link EParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCharacterLiteral(@NotNull EParser.JavaCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJava_identifier(@NotNull EParser.Java_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJava_identifier(@NotNull EParser.Java_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link EParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpReturnStatement(@NotNull EParser.CSharpReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link EParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpReturnStatement(@NotNull EParser.CSharpReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link EParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpStatement(@NotNull EParser.CSharpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link EParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpStatement(@NotNull EParser.CSharpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link EParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPrimaryExpression(@NotNull EParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link EParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPrimaryExpression(@NotNull EParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link EParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpSelectorExpression(@NotNull EParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link EParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpSelectorExpression(@NotNull EParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpParenthesisExpression(@NotNull EParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpParenthesisExpression(@NotNull EParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifierExpression(@NotNull EParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifierExpression(@NotNull EParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpLiteralExpression(@NotNull EParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link EParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpLiteralExpression(@NotNull EParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link EParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpMethodExpression(@NotNull EParser.CSharpMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link EParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpMethodExpression(@NotNull EParser.CSharpMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link EParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpItemExpression(@NotNull EParser.CSharpItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link EParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpItemExpression(@NotNull EParser.CSharpItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_method_expression(@NotNull EParser.Csharp_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_method_expression(@NotNull EParser.Csharp_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link EParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentList(@NotNull EParser.CSharpArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link EParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentList(@NotNull EParser.CSharpArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link EParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentListItem(@NotNull EParser.CSharpArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link EParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentListItem(@NotNull EParser.CSharpArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_item_expression(@NotNull EParser.Csharp_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_item_expression(@NotNull EParser.Csharp_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_parenthesis_expression(@NotNull EParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_parenthesis_expression(@NotNull EParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link EParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifier(@NotNull EParser.CSharpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link EParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifier(@NotNull EParser.CSharpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link EParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpChildIdentifier(@NotNull EParser.CSharpChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link EParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpChildIdentifier(@NotNull EParser.CSharpChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIntegerLiteral(@NotNull EParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIntegerLiteral(@NotNull EParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpDecimalLiteral(@NotNull EParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpDecimalLiteral(@NotNull EParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpTextLiteral(@NotNull EParser.CSharpTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpTextLiteral(@NotNull EParser.CSharpTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpBooleanLiteral(@NotNull EParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpBooleanLiteral(@NotNull EParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCharacterLiteral(@NotNull EParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link EParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCharacterLiteral(@NotNull EParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_identifier(@NotNull EParser.Csharp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_identifier(@NotNull EParser.Csharp_identifierContext ctx);
}