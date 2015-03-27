// Generated from PParser.g4 by ANTLR 4.5
package presto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_category_declaration(@NotNull PParser.Enum_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_category_declaration(@NotNull PParser.Enum_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_native_declaration(@NotNull PParser.Enum_native_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_native_declaration(@NotNull PParser.Enum_native_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol(@NotNull PParser.Native_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol(@NotNull PParser.Native_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol(@NotNull PParser.Category_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol(@NotNull PParser.Category_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull PParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull PParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_category_declaration(@NotNull PParser.Concrete_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_category_declaration(@NotNull PParser.Concrete_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_category_declaration(@NotNull PParser.Singleton_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_category_declaration(@NotNull PParser.Singleton_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerived_list(@NotNull PParser.Derived_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerived_list(@NotNull PParser.Derived_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_method_declaration(@NotNull PParser.Member_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_method_declaration(@NotNull PParser.Member_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_method_declaration(@NotNull PParser.Operator_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_method_declaration(@NotNull PParser.Operator_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetter_method_declaration(@NotNull PParser.Setter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetter_method_declaration(@NotNull PParser.Setter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetter_method_declaration(@NotNull PParser.Getter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetter_method_declaration(@NotNull PParser.Getter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_declaration(@NotNull PParser.Native_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_declaration(@NotNull PParser.Native_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_resource_declaration(@NotNull PParser.Native_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_resource_declaration(@NotNull PParser.Native_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_mappings(@NotNull PParser.Native_category_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_mappings(@NotNull PParser.Native_category_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link PParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingList(@NotNull PParser.NativeCategoryMappingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link PParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingList(@NotNull PParser.NativeCategoryMappingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link PParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingListItem(@NotNull PParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link PParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingListItem(@NotNull PParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull PParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull PParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_method_declaration(@NotNull PParser.Abstract_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_method_declaration(@NotNull PParser.Abstract_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_method_declaration(@NotNull PParser.Concrete_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_method_declaration(@NotNull PParser.Concrete_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_method_declaration(@NotNull PParser.Native_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_method_declaration(@NotNull PParser.Native_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTest_method_declaration(@NotNull PParser.Test_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTest_method_declaration(@NotNull PParser.Test_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull PParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull PParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void enterTyped_argument(@NotNull PParser.Typed_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void exitTyped_argument(@NotNull PParser.Typed_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull PParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull PParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInstanceStatement(@NotNull PParser.AssignInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInstanceStatement(@NotNull PParser.AssignInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignTupleStatement(@NotNull PParser.AssignTupleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignTupleStatement(@NotNull PParser.AssignTupleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull PParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull PParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull PParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull PParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull PParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull PParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull PParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull PParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull PParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull PParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(@NotNull PParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(@NotNull PParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull PParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull PParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull PParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull PParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithResourceStatement(@NotNull PParser.WithResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithResourceStatement(@NotNull PParser.WithResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithSingletonStatement(@NotNull PParser.WithSingletonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithSingletonStatement(@NotNull PParser.WithSingletonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClosureStatement(@NotNull PParser.ClosureStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClosureStatement(@NotNull PParser.ClosureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull PParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull PParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link PParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull PParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link PParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull PParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link PParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodParent(@NotNull PParser.MethodParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link PParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodParent(@NotNull PParser.MethodParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link PParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableRoot(@NotNull PParser.CallableRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link PParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableRoot(@NotNull PParser.CallableRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link PParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableSelector(@NotNull PParser.CallableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link PParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableSelector(@NotNull PParser.CallableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link PParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableMemberSelector(@NotNull PParser.CallableMemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link PParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableMemberSelector(@NotNull PParser.CallableMemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link PParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableItemSelector(@NotNull PParser.CallableItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link PParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableItemSelector(@NotNull PParser.CallableItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_resource_statement(@NotNull PParser.With_resource_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_resource_statement(@NotNull PParser.With_resource_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_singleton_statement(@NotNull PParser.With_singleton_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_singleton_statement(@NotNull PParser.With_singleton_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull PParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull PParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link PParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterAtomicSwitchCase(@NotNull PParser.AtomicSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link PParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitAtomicSwitchCase(@NotNull PParser.AtomicSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link PParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSwitchCase(@NotNull PParser.CollectionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link PParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSwitchCase(@NotNull PParser.CollectionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_statement(@NotNull PParser.For_each_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_statement(@NotNull PParser.For_each_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull PParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull PParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull PParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull PParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull PParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull PParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link PParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementList(@NotNull PParser.ElseIfStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link PParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementList(@NotNull PParser.ElseIfStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link PParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementListItem(@NotNull PParser.ElseIfStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link PParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementListItem(@NotNull PParser.ElseIfStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull PParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull PParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull PParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull PParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link PParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchAtomicStatement(@NotNull PParser.CatchAtomicStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link PParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchAtomicStatement(@NotNull PParser.CatchAtomicStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link PParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchCollectionStatement(@NotNull PParser.CatchCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link PParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchCollectionStatement(@NotNull PParser.CatchCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull PParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull PParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull PParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull PParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull PParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull PParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAnyExpression(@NotNull PParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAnyExpression(@NotNull PParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivideExpression(@NotNull PParser.IntDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivideExpression(@NotNull PParser.IntDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(@NotNull PParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(@NotNull PParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull PParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull PParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoughlyEqualsExpression(@NotNull PParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoughlyEqualsExpression(@NotNull PParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpression(@NotNull PParser.ContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpression(@NotNull PParser.ContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCodeExpression(@NotNull PParser.CodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCodeExpression(@NotNull PParser.CodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(@NotNull PParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(@NotNull PParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull PParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull PParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull PParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull PParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(@NotNull PParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(@NotNull PParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull PParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull PParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(@NotNull PParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(@NotNull PParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(@NotNull PParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(@NotNull PParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull PParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull PParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull PParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull PParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(@NotNull PParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(@NotNull PParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAllExpression(@NotNull PParser.NotContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAllExpression(@NotNull PParser.NotContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(@NotNull PParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(@NotNull PParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull PParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull PParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull PParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull PParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull PParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull PParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAllExpression(@NotNull PParser.ContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAllExpression(@NotNull PParser.ContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(@NotNull PParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(@NotNull PParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsExpression(@NotNull PParser.NotContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsExpression(@NotNull PParser.NotContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(@NotNull PParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(@NotNull PParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(@NotNull PParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(@NotNull PParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAnyExpression(@NotNull PParser.ContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAnyExpression(@NotNull PParser.ContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull PParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull PParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull PParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull PParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(@NotNull PParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(@NotNull PParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull PParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull PParser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link PParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectableExpression(@NotNull PParser.SelectableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link PParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectableExpression(@NotNull PParser.SelectableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link PParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull PParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link PParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull PParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocumentExpression(@NotNull PParser.DocumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocumentExpression(@NotNull PParser.DocumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchExpression(@NotNull PParser.FetchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchExpression(@NotNull PParser.FetchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(@NotNull PParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(@NotNull PParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSortedExpression(@NotNull PParser.SortedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSortedExpression(@NotNull PParser.SortedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull PParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull PParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorExpression(@NotNull PParser.ConstructorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link PParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorExpression(@NotNull PParser.ConstructorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelector(@NotNull PParser.MemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelector(@NotNull PParser.MemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterSliceSelector(@NotNull PParser.SliceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitSliceSelector(@NotNull PParser.SliceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterItemSelector(@NotNull PParser.ItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link PParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitItemSelector(@NotNull PParser.ItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocument_expression(@NotNull PParser.Document_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocument_expression(@NotNull PParser.Document_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(@NotNull PParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(@NotNull PParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentList(@NotNull PParser.ArgumentAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentList(@NotNull PParser.ArgumentAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignmentList(@NotNull PParser.ExpressionAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignmentList(@NotNull PParser.ExpressionAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListItem(@NotNull PParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link PParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListItem(@NotNull PParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArgument_assignment(@NotNull PParser.Argument_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArgument_assignment(@NotNull PParser.Argument_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(@NotNull PParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(@NotNull PParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull PParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull PParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_expression(@NotNull PParser.Fetch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_expression(@NotNull PParser.Fetch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void enterSorted_expression(@NotNull PParser.Sorted_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void exitSorted_expression(@NotNull PParser.Sorted_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instance_statement(@NotNull PParser.Assign_instance_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instance_statement(@NotNull PParser.Assign_instance_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link PParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterMemberInstance(@NotNull PParser.MemberInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link PParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitMemberInstance(@NotNull PParser.MemberInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link PParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterItemInstance(@NotNull PParser.ItemInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link PParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitItemInstance(@NotNull PParser.ItemInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tuple_statement(@NotNull PParser.Assign_tuple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tuple_statement(@NotNull PParser.Assign_tuple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#lfs}.
	 * @param ctx the parse tree
	 */
	void enterLfs(@NotNull PParser.LfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#lfs}.
	 * @param ctx the parse tree
	 */
	void exitLfs(@NotNull PParser.LfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#lfp}.
	 * @param ctx the parse tree
	 */
	void enterLfp(@NotNull PParser.LfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#lfp}.
	 * @param ctx the parse tree
	 */
	void exitLfp(@NotNull PParser.LfpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(@NotNull PParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(@NotNull PParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#dedent}.
	 * @param ctx the parse tree
	 */
	void enterDedent(@NotNull PParser.DedentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#dedent}.
	 * @param ctx the parse tree
	 */
	void exitDedent(@NotNull PParser.DedentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(@NotNull PParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(@NotNull PParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link PParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFullDeclarationList(@NotNull PParser.FullDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link PParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFullDeclarationList(@NotNull PParser.FullDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link PParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationListItem(@NotNull PParser.DeclarationListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link PParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationListItem(@NotNull PParser.DeclarationListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link PParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull PParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link PParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull PParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(@NotNull PParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(@NotNull PParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCategoryDeclaration(@NotNull PParser.CategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCategoryDeclaration(@NotNull PParser.CategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterResourceDeclaration(@NotNull PParser.ResourceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitResourceDeclaration(@NotNull PParser.ResourceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull PParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull PParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull PParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link PParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull PParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(@NotNull PParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(@NotNull PParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link PParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumCategoryDeclaration(@NotNull PParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link PParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumCategoryDeclaration(@NotNull PParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link PParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumNativeDeclaration(@NotNull PParser.EnumNativeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link PParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumNativeDeclaration(@NotNull PParser.EnumNativeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link PParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolList(@NotNull PParser.NativeSymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link PParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolList(@NotNull PParser.NativeSymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link PParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolListItem(@NotNull PParser.NativeSymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link PParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolListItem(@NotNull PParser.NativeSymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link PParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolListItem(@NotNull PParser.CategorySymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link PParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolListItem(@NotNull PParser.CategorySymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link PParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolList(@NotNull PParser.CategorySymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link PParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolList(@NotNull PParser.CategorySymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link PParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolList(@NotNull PParser.SymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link PParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolList(@NotNull PParser.SymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link PParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolListItem(@NotNull PParser.SymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link PParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolListItem(@NotNull PParser.SymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingList(@NotNull PParser.MatchingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingList(@NotNull PParser.MatchingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingSet(@NotNull PParser.MatchingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingSet(@NotNull PParser.MatchingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingRange(@NotNull PParser.MatchingRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingRange(@NotNull PParser.MatchingRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingPattern(@NotNull PParser.MatchingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingPattern(@NotNull PParser.MatchingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingExpression(@NotNull PParser.MatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link PParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingExpression(@NotNull PParser.MatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull PParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull PParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(@NotNull PParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(@NotNull PParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link PParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueListItem(@NotNull PParser.ValueListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link PParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueListItem(@NotNull PParser.ValueListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link PParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull PParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link PParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull PParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void enterRange_literal(@NotNull PParser.Range_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void exitRange_literal(@NotNull PParser.Range_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull PParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull PParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(@NotNull PParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(@NotNull PParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterDictType(@NotNull PParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitDictType(@NotNull PParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull PParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link PParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull PParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link PParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(@NotNull PParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link PParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(@NotNull PParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link PParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryType(@NotNull PParser.CategoryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link PParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryType(@NotNull PParser.CategoryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull PParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull PParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull PParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull PParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(@NotNull PParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(@NotNull PParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull PParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull PParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(@NotNull PParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(@NotNull PParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull PParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull PParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(@NotNull PParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(@NotNull PParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(@NotNull PParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(@NotNull PParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterPeriodType(@NotNull PParser.PeriodTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitPeriodType(@NotNull PParser.PeriodTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCodeType(@NotNull PParser.CodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link PParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCodeType(@NotNull PParser.CodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#category_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_type(@NotNull PParser.Category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#category_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_type(@NotNull PParser.Category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#code_type}.
	 * @param ctx the parse tree
	 */
	void enterCode_type(@NotNull PParser.Code_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#code_type}.
	 * @param ctx the parse tree
	 */
	void exitCode_type(@NotNull PParser.Code_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#document_type}.
	 * @param ctx the parse tree
	 */
	void enterDocument_type(@NotNull PParser.Document_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#document_type}.
	 * @param ctx the parse tree
	 */
	void exitDocument_type(@NotNull PParser.Document_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteCategoryDeclaration(@NotNull PParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteCategoryDeclaration(@NotNull PParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryDeclaration(@NotNull PParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryDeclaration(@NotNull PParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingletonCategoryDeclaration(@NotNull PParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link PParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingletonCategoryDeclaration(@NotNull PParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link PParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierListItem(@NotNull PParser.TypeIdentifierListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link PParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierListItem(@NotNull PParser.TypeIdentifierListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link PParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierList(@NotNull PParser.TypeIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link PParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierList(@NotNull PParser.TypeIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link PParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodVariableIdentifier(@NotNull PParser.MethodVariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link PParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodVariableIdentifier(@NotNull PParser.MethodVariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link PParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeIdentifier(@NotNull PParser.MethodTypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link PParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeIdentifier(@NotNull PParser.MethodTypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull PParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull PParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull PParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull PParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbolIdentifier(@NotNull PParser.SymbolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link PParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbolIdentifier(@NotNull PParser.SymbolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull PParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull PParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull PParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull PParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_identifier(@NotNull PParser.Symbol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_identifier(@NotNull PParser.Symbol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link PParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListItem(@NotNull PParser.ArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link PParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListItem(@NotNull PParser.ArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link PParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull PParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link PParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull PParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link PParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterCodeArgument(@NotNull PParser.CodeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link PParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitCodeArgument(@NotNull PParser.CodeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link PParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArgument(@NotNull PParser.OperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link PParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArgument(@NotNull PParser.OperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link PParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(@NotNull PParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link PParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(@NotNull PParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link PParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgument(@NotNull PParser.TypedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link PParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgument(@NotNull PParser.TypedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(@NotNull PParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(@NotNull PParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void enterCode_argument(@NotNull PParser.Code_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void exitCode_argument(@NotNull PParser.Code_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link PParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryArgumentType(@NotNull PParser.CategoryArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link PParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryArgumentType(@NotNull PParser.CategoryArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link PParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyArgumentType(@NotNull PParser.AnyArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link PParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyArgumentType(@NotNull PParser.AnyArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(@NotNull PParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(@NotNull PParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyListType(@NotNull PParser.AnyListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyListType(@NotNull PParser.AnyListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyDictType(@NotNull PParser.AnyDictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link PParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyDictType(@NotNull PParser.AnyDictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link PParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodListItem(@NotNull PParser.CategoryMethodListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link PParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodListItem(@NotNull PParser.CategoryMethodListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link PParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodList(@NotNull PParser.CategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link PParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodList(@NotNull PParser.CategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetterMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetterMethod(@NotNull PParser.SetterMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetterMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetterMethod(@NotNull PParser.SetterMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterMethod(@NotNull PParser.GetterMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterMethod(@NotNull PParser.GetterMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberMethod(@NotNull PParser.MemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberMethod(@NotNull PParser.MemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMethod(@NotNull PParser.OperatorMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMethod}
	 * labeled alternative in {@link PParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMethod(@NotNull PParser.OperatorMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaCategoryMapping(@NotNull PParser.JavaCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaCategoryMapping(@NotNull PParser.JavaCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCategoryMapping(@NotNull PParser.CSharpCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCategoryMapping(@NotNull PParser.CSharpCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython2CategoryMapping(@NotNull PParser.Python2CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython2CategoryMapping(@NotNull PParser.Python2CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython3CategoryMapping(@NotNull PParser.Python3CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython3CategoryMapping(@NotNull PParser.Python3CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptCategoryMapping(@NotNull PParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link PParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptCategoryMapping(@NotNull PParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython_category_mapping(@NotNull PParser.Python_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython_category_mapping(@NotNull PParser.Python_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_module}.
	 * @param ctx the parse tree
	 */
	void enterPython_module(@NotNull PParser.Python_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_module}.
	 * @param ctx the parse tree
	 */
	void exitPython_module(@NotNull PParser.Python_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#module_token}.
	 * @param ctx the parse tree
	 */
	void enterModule_token(@NotNull PParser.Module_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#module_token}.
	 * @param ctx the parse tree
	 */
	void exitModule_token(@NotNull PParser.Module_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_category_mapping(@NotNull PParser.Javascript_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_category_mapping(@NotNull PParser.Javascript_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_module(@NotNull PParser.Javascript_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_module(@NotNull PParser.Javascript_moduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link PParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(@NotNull PParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link PParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(@NotNull PParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link PParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableListItem(@NotNull PParser.VariableListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link PParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableListItem(@NotNull PParser.VariableListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethod(@NotNull PParser.AbstractMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethod(@NotNull PParser.AbstractMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMethod(@NotNull PParser.ConcreteMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMethod(@NotNull PParser.ConcreteMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeMethod(@NotNull PParser.NativeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeMethod(@NotNull PParser.NativeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTestMethod(@NotNull PParser.TestMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link PParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTestMethod(@NotNull PParser.TestMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link PParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementList(@NotNull PParser.NativeStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link PParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementList(@NotNull PParser.NativeStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link PParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementListItem(@NotNull PParser.NativeStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link PParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementListItem(@NotNull PParser.NativeStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaNativeStatement(@NotNull PParser.JavaNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaNativeStatement(@NotNull PParser.JavaNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpNativeStatement(@NotNull PParser.CSharpNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpNativeStatement(@NotNull PParser.CSharpNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython2NativeStatement(@NotNull PParser.Python2NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython2NativeStatement(@NotNull PParser.Python2NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython3NativeStatement(@NotNull PParser.Python3NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython3NativeStatement(@NotNull PParser.Python3NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptNativeStatement(@NotNull PParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link PParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptNativeStatement(@NotNull PParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython_native_statement(@NotNull PParser.Python_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython_native_statement(@NotNull PParser.Python_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_native_statement(@NotNull PParser.Javascript_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_native_statement(@NotNull PParser.Javascript_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link PParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementListItem(@NotNull PParser.StatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link PParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementListItem(@NotNull PParser.StatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link PParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull PParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link PParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull PParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link PParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionListItem(@NotNull PParser.AssertionListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link PParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionListItem(@NotNull PParser.AssertionListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link PParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionList(@NotNull PParser.AssertionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link PParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionList(@NotNull PParser.AssertionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link PParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementListItem(@NotNull PParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link PParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementListItem(@NotNull PParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link PParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementList(@NotNull PParser.SwitchCaseStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link PParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementList(@NotNull PParser.SwitchCaseStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link PParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementListItem(@NotNull PParser.CatchStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link PParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementListItem(@NotNull PParser.CatchStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link PParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementList(@NotNull PParser.CatchStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link PParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementList(@NotNull PParser.CatchStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRangeLiteral(@NotNull PParser.LiteralRangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRangeLiteral(@NotNull PParser.LiteralRangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListLiteral(@NotNull PParser.LiteralListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListLiteral(@NotNull PParser.LiteralListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSetLiteral(@NotNull PParser.LiteralSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link PParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSetLiteral(@NotNull PParser.LiteralSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMinIntegerLiteral(@NotNull PParser.MinIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMinIntegerLiteral(@NotNull PParser.MinIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMaxIntegerLiteral(@NotNull PParser.MaxIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMaxIntegerLiteral(@NotNull PParser.MaxIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull PParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull PParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull PParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull PParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(@NotNull PParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(@NotNull PParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull PParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull PParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(@NotNull PParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(@NotNull PParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(@NotNull PParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(@NotNull PParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull PParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull PParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(@NotNull PParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(@NotNull PParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull PParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull PParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterPeriodLiteral(@NotNull PParser.PeriodLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitPeriodLiteral(@NotNull PParser.PeriodLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull PParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link PParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull PParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link PParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(@NotNull PParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link PParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(@NotNull PParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link PParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListItem(@NotNull PParser.LiteralListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link PParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListItem(@NotNull PParser.LiteralListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull PParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull PParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull PParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull PParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull PParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull PParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull PParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link PParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull PParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expression(@NotNull PParser.This_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expression(@NotNull PParser.This_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(@NotNull PParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(@NotNull PParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link PParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLiteral(@NotNull PParser.AtomicLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link PParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLiteral(@NotNull PParser.AtomicLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link PParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull PParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link PParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull PParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(@NotNull PParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(@NotNull PParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(@NotNull PParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(@NotNull PParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(@NotNull PParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(@NotNull PParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(@NotNull PParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(@NotNull PParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteral(@NotNull PParser.TupleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link PParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteral(@NotNull PParser.TupleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(@NotNull PParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(@NotNull PParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(@NotNull PParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(@NotNull PParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link PParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTupleItem(@NotNull PParser.ValueTupleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link PParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTupleItem(@NotNull PParser.ValueTupleItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link PParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(@NotNull PParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link PParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(@NotNull PParser.ValueTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link PParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryList(@NotNull PParser.DictEntryListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link PParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryList(@NotNull PParser.DictEntryListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link PParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryListItem(@NotNull PParser.DictEntryListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link PParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryListItem(@NotNull PParser.DictEntryListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(@NotNull PParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(@NotNull PParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstAndLast(@NotNull PParser.SliceFirstAndLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstAndLast(@NotNull PParser.SliceFirstAndLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstOnly(@NotNull PParser.SliceFirstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstOnly(@NotNull PParser.SliceFirstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceLastOnly(@NotNull PParser.SliceLastOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link PParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceLastOnly(@NotNull PParser.SliceLastOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_statement(@NotNull PParser.Assign_variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_statement(@NotNull PParser.Assign_variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link PParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterRootInstance(@NotNull PParser.RootInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link PParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitRootInstance(@NotNull PParser.RootInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link PParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterChildInstance(@NotNull PParser.ChildInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link PParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitChildInstance(@NotNull PParser.ChildInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link PParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsATypeExpression(@NotNull PParser.IsATypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link PParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsATypeExpression(@NotNull PParser.IsATypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link PParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsOtherExpression(@NotNull PParser.IsOtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link PParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsOtherExpression(@NotNull PParser.IsOtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlus(@NotNull PParser.OperatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlus(@NotNull PParser.OperatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMinus(@NotNull PParser.OperatorMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMinus(@NotNull PParser.OperatorMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMultiply(@NotNull PParser.OperatorMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMultiply(@NotNull PParser.OperatorMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDivide(@NotNull PParser.OperatorDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDivide(@NotNull PParser.OperatorDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIDivide(@NotNull PParser.OperatorIDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIDivide(@NotNull PParser.OperatorIDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorModulo(@NotNull PParser.OperatorModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorModulo(@NotNull PParser.OperatorModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#key_token}.
	 * @param ctx the parse tree
	 */
	void enterKey_token(@NotNull PParser.Key_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#key_token}.
	 * @param ctx the parse tree
	 */
	void exitKey_token(@NotNull PParser.Key_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#value_token}.
	 * @param ctx the parse tree
	 */
	void enterValue_token(@NotNull PParser.Value_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#value_token}.
	 * @param ctx the parse tree
	 */
	void exitValue_token(@NotNull PParser.Value_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_token(@NotNull PParser.Symbols_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_token(@NotNull PParser.Symbols_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull PParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull PParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull PParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull PParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull PParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull PParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#idivide}.
	 * @param ctx the parse tree
	 */
	void enterIdivide(@NotNull PParser.IdivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#idivide}.
	 * @param ctx the parse tree
	 */
	void exitIdivide(@NotNull PParser.IdivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull PParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull PParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link PParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptReturnStatement(@NotNull PParser.JavascriptReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link PParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptReturnStatement(@NotNull PParser.JavascriptReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link PParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptStatement(@NotNull PParser.JavascriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link PParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptStatement(@NotNull PParser.JavascriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link PParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptPrimaryExpression(@NotNull PParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link PParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptPrimaryExpression(@NotNull PParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link PParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptSelectorExpression(@NotNull PParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link PParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptSelectorExpression(@NotNull PParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptParenthesisExpression(@NotNull PParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptParenthesisExpression(@NotNull PParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifierExpression(@NotNull PParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifierExpression(@NotNull PParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptLiteralExpression(@NotNull PParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link PParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptLiteralExpression(@NotNull PParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link PParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptMethodExpression(@NotNull PParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link PParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptMethodExpression(@NotNull PParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link PParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptItemExpression(@NotNull PParser.JavascriptItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link PParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptItemExpression(@NotNull PParser.JavascriptItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_method_expression(@NotNull PParser.Javascript_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_method_expression(@NotNull PParser.Javascript_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link PParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentListItem(@NotNull PParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link PParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentListItem(@NotNull PParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link PParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentList(@NotNull PParser.JavascriptArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link PParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentList(@NotNull PParser.JavascriptArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_item_expression(@NotNull PParser.Javascript_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_item_expression(@NotNull PParser.Javascript_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_parenthesis_expression(@NotNull PParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_parenthesis_expression(@NotNull PParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link PParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptChildIdentifier(@NotNull PParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link PParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptChildIdentifier(@NotNull PParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link PParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifier(@NotNull PParser.JavascriptIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link PParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifier(@NotNull PParser.JavascriptIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIntegerLiteral(@NotNull PParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIntegerLiteral(@NotNull PParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptDecimalLiteral(@NotNull PParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptDecimalLiteral(@NotNull PParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptTextLiteral(@NotNull PParser.JavascriptTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptTextLiteral(@NotNull PParser.JavascriptTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptBooleanLiteral(@NotNull PParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptBooleanLiteral(@NotNull PParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptCharacterLiteral(@NotNull PParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link PParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptCharacterLiteral(@NotNull PParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier(@NotNull PParser.Javascript_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier(@NotNull PParser.Javascript_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link PParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturnStatement(@NotNull PParser.PythonReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link PParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturnStatement(@NotNull PParser.PythonReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link PParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(@NotNull PParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link PParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(@NotNull PParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link PParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPrimaryExpression(@NotNull PParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link PParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPrimaryExpression(@NotNull PParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link PParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelectorExpression(@NotNull PParser.PythonSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link PParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelectorExpression(@NotNull PParser.PythonSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonParenthesisExpression(@NotNull PParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonParenthesisExpression(@NotNull PParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifierExpression(@NotNull PParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifierExpression(@NotNull PParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonLiteralExpression(@NotNull PParser.PythonLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonLiteralExpression(@NotNull PParser.PythonLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonGlobalMethodExpression(@NotNull PParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link PParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonGlobalMethodExpression(@NotNull PParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link PParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonMethodExpression(@NotNull PParser.PythonMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link PParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonMethodExpression(@NotNull PParser.PythonMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link PParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonItemExpression(@NotNull PParser.PythonItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link PParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonItemExpression(@NotNull PParser.PythonItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_method_expression(@NotNull PParser.Python_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_method_expression(@NotNull PParser.Python_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalOnlyArgumentList(@NotNull PParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalOnlyArgumentList(@NotNull PParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedOnlyArgumentList(@NotNull PParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedOnlyArgumentList(@NotNull PParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgumentList(@NotNull PParser.PythonArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link PParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgumentList(@NotNull PParser.PythonArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link PParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentListItem(@NotNull PParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link PParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentListItem(@NotNull PParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link PParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentList(@NotNull PParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link PParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentList(@NotNull PParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link PParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentListItem(@NotNull PParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link PParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentListItem(@NotNull PParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link PParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentList(@NotNull PParser.PythonNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link PParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentList(@NotNull PParser.PythonNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_parenthesis_expression(@NotNull PParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_parenthesis_expression(@NotNull PParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link PParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonChildIdentifier(@NotNull PParser.PythonChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link PParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonChildIdentifier(@NotNull PParser.PythonChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link PParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifier(@NotNull PParser.PythonIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link PParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifier(@NotNull PParser.PythonIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIntegerLiteral(@NotNull PParser.PythonIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIntegerLiteral(@NotNull PParser.PythonIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecimalLiteral(@NotNull PParser.PythonDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecimalLiteral(@NotNull PParser.PythonDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonTextLiteral(@NotNull PParser.PythonTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonTextLiteral(@NotNull PParser.PythonTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonBooleanLiteral(@NotNull PParser.PythonBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonBooleanLiteral(@NotNull PParser.PythonBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonCharacterLiteral(@NotNull PParser.PythonCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link PParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonCharacterLiteral(@NotNull PParser.PythonCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPython_identifier(@NotNull PParser.Python_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPython_identifier(@NotNull PParser.Python_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link PParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaReturnStatement(@NotNull PParser.JavaReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link PParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaReturnStatement(@NotNull PParser.JavaReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link PParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaStatement(@NotNull PParser.JavaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link PParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaStatement(@NotNull PParser.JavaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link PParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaPrimaryExpression(@NotNull PParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link PParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaPrimaryExpression(@NotNull PParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link PParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaSelectorExpression(@NotNull PParser.JavaSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link PParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaSelectorExpression(@NotNull PParser.JavaSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaParenthesisExpression(@NotNull PParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaParenthesisExpression(@NotNull PParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifierExpression(@NotNull PParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifierExpression(@NotNull PParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaLiteralExpression(@NotNull PParser.JavaLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link PParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaLiteralExpression(@NotNull PParser.JavaLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link PParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaMethodExpression(@NotNull PParser.JavaMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link PParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaMethodExpression(@NotNull PParser.JavaMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link PParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaItemExpression(@NotNull PParser.JavaItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link PParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaItemExpression(@NotNull PParser.JavaItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_method_expression(@NotNull PParser.Java_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_method_expression(@NotNull PParser.Java_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link PParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentList(@NotNull PParser.JavaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link PParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentList(@NotNull PParser.JavaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link PParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentListItem(@NotNull PParser.JavaArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link PParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentListItem(@NotNull PParser.JavaArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_item_expression(@NotNull PParser.Java_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_item_expression(@NotNull PParser.Java_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_parenthesis_expression(@NotNull PParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_parenthesis_expression(@NotNull PParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link PParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifier(@NotNull PParser.JavaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link PParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifier(@NotNull PParser.JavaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link PParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildIdentifier(@NotNull PParser.JavaChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link PParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildIdentifier(@NotNull PParser.JavaChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link PParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildClassIdentifier(@NotNull PParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link PParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildClassIdentifier(@NotNull PParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link PParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaClassIdentifier(@NotNull PParser.JavaClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link PParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaClassIdentifier(@NotNull PParser.JavaClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIntegerLiteral(@NotNull PParser.JavaIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIntegerLiteral(@NotNull PParser.JavaIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaDecimalLiteral(@NotNull PParser.JavaDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaDecimalLiteral(@NotNull PParser.JavaDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaTextLiteral(@NotNull PParser.JavaTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaTextLiteral(@NotNull PParser.JavaTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaBooleanLiteral(@NotNull PParser.JavaBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaBooleanLiteral(@NotNull PParser.JavaBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCharacterLiteral(@NotNull PParser.JavaCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link PParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCharacterLiteral(@NotNull PParser.JavaCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJava_identifier(@NotNull PParser.Java_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJava_identifier(@NotNull PParser.Java_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link PParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpReturnStatement(@NotNull PParser.CSharpReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link PParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpReturnStatement(@NotNull PParser.CSharpReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link PParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpStatement(@NotNull PParser.CSharpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link PParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpStatement(@NotNull PParser.CSharpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link PParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPrimaryExpression(@NotNull PParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link PParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPrimaryExpression(@NotNull PParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link PParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpSelectorExpression(@NotNull PParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link PParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpSelectorExpression(@NotNull PParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpParenthesisExpression(@NotNull PParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpParenthesisExpression(@NotNull PParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifierExpression(@NotNull PParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifierExpression(@NotNull PParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpLiteralExpression(@NotNull PParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link PParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpLiteralExpression(@NotNull PParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link PParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpMethodExpression(@NotNull PParser.CSharpMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link PParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpMethodExpression(@NotNull PParser.CSharpMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link PParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpItemExpression(@NotNull PParser.CSharpItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link PParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpItemExpression(@NotNull PParser.CSharpItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_method_expression(@NotNull PParser.Csharp_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_method_expression(@NotNull PParser.Csharp_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link PParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentList(@NotNull PParser.CSharpArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link PParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentList(@NotNull PParser.CSharpArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link PParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentListItem(@NotNull PParser.CSharpArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link PParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentListItem(@NotNull PParser.CSharpArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_item_expression(@NotNull PParser.Csharp_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_item_expression(@NotNull PParser.Csharp_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_parenthesis_expression(@NotNull PParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_parenthesis_expression(@NotNull PParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link PParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifier(@NotNull PParser.CSharpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link PParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifier(@NotNull PParser.CSharpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link PParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpChildIdentifier(@NotNull PParser.CSharpChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link PParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpChildIdentifier(@NotNull PParser.CSharpChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIntegerLiteral(@NotNull PParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIntegerLiteral(@NotNull PParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpDecimalLiteral(@NotNull PParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpDecimalLiteral(@NotNull PParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpTextLiteral(@NotNull PParser.CSharpTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpTextLiteral(@NotNull PParser.CSharpTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpBooleanLiteral(@NotNull PParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpBooleanLiteral(@NotNull PParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCharacterLiteral(@NotNull PParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link PParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCharacterLiteral(@NotNull PParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_identifier(@NotNull PParser.Csharp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_identifier(@NotNull PParser.Csharp_identifierContext ctx);
}