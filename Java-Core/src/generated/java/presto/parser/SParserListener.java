// Generated from SParser.g4 by ANTLR 4.5
package presto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SParser}.
 */
public interface SParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_category_declaration(@NotNull SParser.Enum_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_category_declaration(@NotNull SParser.Enum_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_native_declaration(@NotNull SParser.Enum_native_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_native_declaration(@NotNull SParser.Enum_native_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol(@NotNull SParser.Native_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol(@NotNull SParser.Native_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol(@NotNull SParser.Category_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol(@NotNull SParser.Category_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull SParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull SParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_category_declaration(@NotNull SParser.Concrete_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_category_declaration(@NotNull SParser.Concrete_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_category_declaration(@NotNull SParser.Singleton_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_category_declaration(@NotNull SParser.Singleton_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerived_list(@NotNull SParser.Derived_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerived_list(@NotNull SParser.Derived_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_method_declaration(@NotNull SParser.Operator_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_method_declaration(@NotNull SParser.Operator_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetter_method_declaration(@NotNull SParser.Setter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetter_method_declaration(@NotNull SParser.Setter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetter_method_declaration(@NotNull SParser.Getter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetter_method_declaration(@NotNull SParser.Getter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_declaration(@NotNull SParser.Native_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_declaration(@NotNull SParser.Native_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_resource_declaration(@NotNull SParser.Native_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_resource_declaration(@NotNull SParser.Native_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_mappings(@NotNull SParser.Native_category_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_mappings(@NotNull SParser.Native_category_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link SParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingList(@NotNull SParser.NativeCategoryMappingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link SParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingList(@NotNull SParser.NativeCategoryMappingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link SParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingListItem(@NotNull SParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link SParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingListItem(@NotNull SParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull SParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull SParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_method_declaration(@NotNull SParser.Abstract_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_method_declaration(@NotNull SParser.Abstract_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_method_declaration(@NotNull SParser.Concrete_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_method_declaration(@NotNull SParser.Concrete_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_method_declaration(@NotNull SParser.Native_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_method_declaration(@NotNull SParser.Native_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTest_method_declaration(@NotNull SParser.Test_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTest_method_declaration(@NotNull SParser.Test_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull SParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull SParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void enterTyped_argument(@NotNull SParser.Typed_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void exitTyped_argument(@NotNull SParser.Typed_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull SParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull SParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInstanceStatement(@NotNull SParser.AssignInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInstanceStatement(@NotNull SParser.AssignInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignTupleStatement(@NotNull SParser.AssignTupleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignTupleStatement(@NotNull SParser.AssignTupleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull SParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull SParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull SParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull SParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull SParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull SParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull SParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull SParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull SParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull SParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull SParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull SParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(@NotNull SParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(@NotNull SParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull SParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull SParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull SParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull SParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithResourceStatement(@NotNull SParser.WithResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithResourceStatement(@NotNull SParser.WithResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithSingletonStatement(@NotNull SParser.WithSingletonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithSingletonStatement(@NotNull SParser.WithSingletonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClosureStatement(@NotNull SParser.ClosureStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link SParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClosureStatement(@NotNull SParser.ClosureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull SParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull SParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link SParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull SParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link SParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull SParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link SParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodParent(@NotNull SParser.MethodParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link SParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodParent(@NotNull SParser.MethodParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link SParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableRoot(@NotNull SParser.CallableRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link SParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableRoot(@NotNull SParser.CallableRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link SParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableSelector(@NotNull SParser.CallableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link SParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableSelector(@NotNull SParser.CallableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link SParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableMemberSelector(@NotNull SParser.CallableMemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link SParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableMemberSelector(@NotNull SParser.CallableMemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link SParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableItemSelector(@NotNull SParser.CallableItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link SParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableItemSelector(@NotNull SParser.CallableItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_resource_statement(@NotNull SParser.With_resource_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_resource_statement(@NotNull SParser.With_resource_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_singleton_statement(@NotNull SParser.With_singleton_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_singleton_statement(@NotNull SParser.With_singleton_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull SParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull SParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link SParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterAtomicSwitchCase(@NotNull SParser.AtomicSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link SParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitAtomicSwitchCase(@NotNull SParser.AtomicSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link SParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSwitchCase(@NotNull SParser.CollectionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link SParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSwitchCase(@NotNull SParser.CollectionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_statement(@NotNull SParser.For_each_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_statement(@NotNull SParser.For_each_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull SParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull SParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull SParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull SParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull SParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull SParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link SParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementList(@NotNull SParser.ElseIfStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link SParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementList(@NotNull SParser.ElseIfStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link SParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementListItem(@NotNull SParser.ElseIfStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link SParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementListItem(@NotNull SParser.ElseIfStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull SParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull SParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull SParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull SParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link SParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchAtomicStatement(@NotNull SParser.CatchAtomicStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link SParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchAtomicStatement(@NotNull SParser.CatchAtomicStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link SParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchCollectionStatement(@NotNull SParser.CatchCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link SParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchCollectionStatement(@NotNull SParser.CatchCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull SParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull SParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull SParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull SParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull SParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull SParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAnyExpression(@NotNull SParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAnyExpression(@NotNull SParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivideExpression(@NotNull SParser.IntDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivideExpression(@NotNull SParser.IntDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(@NotNull SParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(@NotNull SParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull SParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull SParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoughlyEqualsExpression(@NotNull SParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoughlyEqualsExpression(@NotNull SParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpression(@NotNull SParser.ContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpression(@NotNull SParser.ContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCodeExpression(@NotNull SParser.CodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCodeExpression(@NotNull SParser.CodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(@NotNull SParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(@NotNull SParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull SParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull SParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull SParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull SParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(@NotNull SParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(@NotNull SParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull SParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull SParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(@NotNull SParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(@NotNull SParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(@NotNull SParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(@NotNull SParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull SParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull SParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull SParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull SParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(@NotNull SParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(@NotNull SParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAllExpression(@NotNull SParser.NotContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAllExpression(@NotNull SParser.NotContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(@NotNull SParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(@NotNull SParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull SParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull SParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull SParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull SParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull SParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull SParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAllExpression(@NotNull SParser.ContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAllExpression(@NotNull SParser.ContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(@NotNull SParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(@NotNull SParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsExpression(@NotNull SParser.NotContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsExpression(@NotNull SParser.NotContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(@NotNull SParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(@NotNull SParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(@NotNull SParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(@NotNull SParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAnyExpression(@NotNull SParser.ContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAnyExpression(@NotNull SParser.ContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull SParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull SParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull SParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull SParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(@NotNull SParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link SParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(@NotNull SParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull SParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull SParser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link SParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectableExpression(@NotNull SParser.SelectableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link SParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectableExpression(@NotNull SParser.SelectableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link SParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull SParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link SParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull SParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocumentExpression(@NotNull SParser.DocumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocumentExpression(@NotNull SParser.DocumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchExpression(@NotNull SParser.FetchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchExpression(@NotNull SParser.FetchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(@NotNull SParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(@NotNull SParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSortedExpression(@NotNull SParser.SortedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSortedExpression(@NotNull SParser.SortedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull SParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull SParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorExpression(@NotNull SParser.ConstructorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link SParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorExpression(@NotNull SParser.ConstructorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelector(@NotNull SParser.MemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelector(@NotNull SParser.MemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterSliceSelector(@NotNull SParser.SliceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitSliceSelector(@NotNull SParser.SliceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterItemSelector(@NotNull SParser.ItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link SParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitItemSelector(@NotNull SParser.ItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocument_expression(@NotNull SParser.Document_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocument_expression(@NotNull SParser.Document_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(@NotNull SParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(@NotNull SParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentList(@NotNull SParser.ArgumentAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentList(@NotNull SParser.ArgumentAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignmentList(@NotNull SParser.ExpressionAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignmentList(@NotNull SParser.ExpressionAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListItem(@NotNull SParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link SParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListItem(@NotNull SParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArgument_assignment(@NotNull SParser.Argument_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArgument_assignment(@NotNull SParser.Argument_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(@NotNull SParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(@NotNull SParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull SParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull SParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_expression(@NotNull SParser.Fetch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_expression(@NotNull SParser.Fetch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void enterSorted_expression(@NotNull SParser.Sorted_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void exitSorted_expression(@NotNull SParser.Sorted_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instance_statement(@NotNull SParser.Assign_instance_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instance_statement(@NotNull SParser.Assign_instance_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link SParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterMemberInstance(@NotNull SParser.MemberInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link SParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitMemberInstance(@NotNull SParser.MemberInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link SParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterItemInstance(@NotNull SParser.ItemInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link SParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitItemInstance(@NotNull SParser.ItemInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tuple_statement(@NotNull SParser.Assign_tuple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tuple_statement(@NotNull SParser.Assign_tuple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#lfs}.
	 * @param ctx the parse tree
	 */
	void enterLfs(@NotNull SParser.LfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#lfs}.
	 * @param ctx the parse tree
	 */
	void exitLfs(@NotNull SParser.LfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#lfp}.
	 * @param ctx the parse tree
	 */
	void enterLfp(@NotNull SParser.LfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#lfp}.
	 * @param ctx the parse tree
	 */
	void exitLfp(@NotNull SParser.LfpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(@NotNull SParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(@NotNull SParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#dedent}.
	 * @param ctx the parse tree
	 */
	void enterDedent(@NotNull SParser.DedentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#dedent}.
	 * @param ctx the parse tree
	 */
	void exitDedent(@NotNull SParser.DedentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(@NotNull SParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(@NotNull SParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link SParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFullDeclarationList(@NotNull SParser.FullDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link SParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFullDeclarationList(@NotNull SParser.FullDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link SParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationListItem(@NotNull SParser.DeclarationListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link SParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationListItem(@NotNull SParser.DeclarationListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link SParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull SParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link SParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull SParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(@NotNull SParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(@NotNull SParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCategoryDeclaration(@NotNull SParser.CategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCategoryDeclaration(@NotNull SParser.CategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterResourceDeclaration(@NotNull SParser.ResourceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitResourceDeclaration(@NotNull SParser.ResourceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull SParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull SParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull SParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link SParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull SParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(@NotNull SParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(@NotNull SParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link SParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumCategoryDeclaration(@NotNull SParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link SParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumCategoryDeclaration(@NotNull SParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link SParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumNativeDeclaration(@NotNull SParser.EnumNativeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link SParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumNativeDeclaration(@NotNull SParser.EnumNativeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link SParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolList(@NotNull SParser.NativeSymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link SParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolList(@NotNull SParser.NativeSymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link SParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolListItem(@NotNull SParser.NativeSymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link SParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolListItem(@NotNull SParser.NativeSymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link SParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolListItem(@NotNull SParser.CategorySymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link SParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolListItem(@NotNull SParser.CategorySymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link SParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolList(@NotNull SParser.CategorySymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link SParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolList(@NotNull SParser.CategorySymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link SParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolList(@NotNull SParser.SymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link SParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolList(@NotNull SParser.SymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link SParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolListItem(@NotNull SParser.SymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link SParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolListItem(@NotNull SParser.SymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingList(@NotNull SParser.MatchingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingList(@NotNull SParser.MatchingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingSet(@NotNull SParser.MatchingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingSet(@NotNull SParser.MatchingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingRange(@NotNull SParser.MatchingRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingRange(@NotNull SParser.MatchingRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingPattern(@NotNull SParser.MatchingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingPattern(@NotNull SParser.MatchingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingExpression(@NotNull SParser.MatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link SParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingExpression(@NotNull SParser.MatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull SParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull SParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(@NotNull SParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(@NotNull SParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link SParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueListItem(@NotNull SParser.ValueListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link SParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueListItem(@NotNull SParser.ValueListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link SParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull SParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link SParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull SParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void enterRange_literal(@NotNull SParser.Range_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void exitRange_literal(@NotNull SParser.Range_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull SParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull SParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(@NotNull SParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(@NotNull SParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterDictType(@NotNull SParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitDictType(@NotNull SParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull SParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link SParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull SParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link SParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(@NotNull SParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link SParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(@NotNull SParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link SParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryType(@NotNull SParser.CategoryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link SParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryType(@NotNull SParser.CategoryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull SParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull SParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull SParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull SParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(@NotNull SParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(@NotNull SParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull SParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull SParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(@NotNull SParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(@NotNull SParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull SParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull SParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(@NotNull SParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(@NotNull SParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(@NotNull SParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(@NotNull SParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterPeriodType(@NotNull SParser.PeriodTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitPeriodType(@NotNull SParser.PeriodTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCodeType(@NotNull SParser.CodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link SParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCodeType(@NotNull SParser.CodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#category_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_type(@NotNull SParser.Category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#category_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_type(@NotNull SParser.Category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#code_type}.
	 * @param ctx the parse tree
	 */
	void enterCode_type(@NotNull SParser.Code_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#code_type}.
	 * @param ctx the parse tree
	 */
	void exitCode_type(@NotNull SParser.Code_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#document_type}.
	 * @param ctx the parse tree
	 */
	void enterDocument_type(@NotNull SParser.Document_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#document_type}.
	 * @param ctx the parse tree
	 */
	void exitDocument_type(@NotNull SParser.Document_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteCategoryDeclaration(@NotNull SParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteCategoryDeclaration(@NotNull SParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryDeclaration(@NotNull SParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryDeclaration(@NotNull SParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingletonCategoryDeclaration(@NotNull SParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link SParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingletonCategoryDeclaration(@NotNull SParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link SParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierListItem(@NotNull SParser.TypeIdentifierListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link SParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierListItem(@NotNull SParser.TypeIdentifierListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link SParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierList(@NotNull SParser.TypeIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link SParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierList(@NotNull SParser.TypeIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link SParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodVariableIdentifier(@NotNull SParser.MethodVariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link SParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodVariableIdentifier(@NotNull SParser.MethodVariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link SParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeIdentifier(@NotNull SParser.MethodTypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link SParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeIdentifier(@NotNull SParser.MethodTypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull SParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull SParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull SParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull SParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbolIdentifier(@NotNull SParser.SymbolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link SParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbolIdentifier(@NotNull SParser.SymbolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull SParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull SParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull SParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull SParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_identifier(@NotNull SParser.Symbol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_identifier(@NotNull SParser.Symbol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link SParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListItem(@NotNull SParser.ArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link SParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListItem(@NotNull SParser.ArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link SParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull SParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link SParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull SParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link SParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterCodeArgument(@NotNull SParser.CodeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link SParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitCodeArgument(@NotNull SParser.CodeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link SParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArgument(@NotNull SParser.OperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link SParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArgument(@NotNull SParser.OperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link SParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(@NotNull SParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link SParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(@NotNull SParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link SParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgument(@NotNull SParser.TypedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link SParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgument(@NotNull SParser.TypedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(@NotNull SParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(@NotNull SParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void enterCode_argument(@NotNull SParser.Code_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void exitCode_argument(@NotNull SParser.Code_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link SParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryArgumentType(@NotNull SParser.CategoryArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link SParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryArgumentType(@NotNull SParser.CategoryArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link SParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyArgumentType(@NotNull SParser.AnyArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link SParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyArgumentType(@NotNull SParser.AnyArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(@NotNull SParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(@NotNull SParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyListType(@NotNull SParser.AnyListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyListType(@NotNull SParser.AnyListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyDictType(@NotNull SParser.AnyDictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link SParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyDictType(@NotNull SParser.AnyDictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link SParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodListItem(@NotNull SParser.CategoryMethodListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link SParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodListItem(@NotNull SParser.CategoryMethodListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link SParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodList(@NotNull SParser.CategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link SParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodList(@NotNull SParser.CategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetterMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetterMemberMethod(@NotNull SParser.SetterMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetterMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetterMemberMethod(@NotNull SParser.SetterMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterMemberMethod(@NotNull SParser.GetterMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterMemberMethod(@NotNull SParser.GetterMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMemberMethod(@NotNull SParser.ConcreteMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMemberMethod(@NotNull SParser.ConcreteMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMemberMethod(@NotNull SParser.AbstractMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMemberMethod(@NotNull SParser.AbstractMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMemberMethod(@NotNull SParser.OperatorMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMemberMethod}
	 * labeled alternative in {@link SParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMemberMethod(@NotNull SParser.OperatorMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaCategoryMapping(@NotNull SParser.JavaCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaCategoryMapping(@NotNull SParser.JavaCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCategoryMapping(@NotNull SParser.CSharpCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCategoryMapping(@NotNull SParser.CSharpCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython2CategoryMapping(@NotNull SParser.Python2CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython2CategoryMapping(@NotNull SParser.Python2CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython3CategoryMapping(@NotNull SParser.Python3CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython3CategoryMapping(@NotNull SParser.Python3CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptCategoryMapping(@NotNull SParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link SParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptCategoryMapping(@NotNull SParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython_category_mapping(@NotNull SParser.Python_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython_category_mapping(@NotNull SParser.Python_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_module}.
	 * @param ctx the parse tree
	 */
	void enterPython_module(@NotNull SParser.Python_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_module}.
	 * @param ctx the parse tree
	 */
	void exitPython_module(@NotNull SParser.Python_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#module_token}.
	 * @param ctx the parse tree
	 */
	void enterModule_token(@NotNull SParser.Module_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#module_token}.
	 * @param ctx the parse tree
	 */
	void exitModule_token(@NotNull SParser.Module_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_category_mapping(@NotNull SParser.Javascript_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_category_mapping(@NotNull SParser.Javascript_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_module(@NotNull SParser.Javascript_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_module(@NotNull SParser.Javascript_moduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link SParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(@NotNull SParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link SParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(@NotNull SParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link SParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableListItem(@NotNull SParser.VariableListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link SParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableListItem(@NotNull SParser.VariableListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethod(@NotNull SParser.AbstractMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethod(@NotNull SParser.AbstractMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMethod(@NotNull SParser.ConcreteMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMethod(@NotNull SParser.ConcreteMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeMethod(@NotNull SParser.NativeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeMethod(@NotNull SParser.NativeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTestMethod(@NotNull SParser.TestMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestMethod}
	 * labeled alternative in {@link SParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTestMethod(@NotNull SParser.TestMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link SParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementList(@NotNull SParser.NativeStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link SParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementList(@NotNull SParser.NativeStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link SParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementListItem(@NotNull SParser.NativeStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link SParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementListItem(@NotNull SParser.NativeStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaNativeStatement(@NotNull SParser.JavaNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaNativeStatement(@NotNull SParser.JavaNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpNativeStatement(@NotNull SParser.CSharpNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpNativeStatement(@NotNull SParser.CSharpNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython2NativeStatement(@NotNull SParser.Python2NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython2NativeStatement(@NotNull SParser.Python2NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython3NativeStatement(@NotNull SParser.Python3NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython3NativeStatement(@NotNull SParser.Python3NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptNativeStatement(@NotNull SParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link SParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptNativeStatement(@NotNull SParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython_native_statement(@NotNull SParser.Python_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython_native_statement(@NotNull SParser.Python_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_native_statement(@NotNull SParser.Javascript_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_native_statement(@NotNull SParser.Javascript_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link SParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementListItem(@NotNull SParser.StatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link SParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementListItem(@NotNull SParser.StatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link SParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull SParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link SParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull SParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link SParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionListItem(@NotNull SParser.AssertionListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionListItem}
	 * labeled alternative in {@link SParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionListItem(@NotNull SParser.AssertionListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link SParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertionList(@NotNull SParser.AssertionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionList}
	 * labeled alternative in {@link SParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertionList(@NotNull SParser.AssertionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link SParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementListItem(@NotNull SParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link SParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementListItem(@NotNull SParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link SParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementList(@NotNull SParser.SwitchCaseStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link SParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementList(@NotNull SParser.SwitchCaseStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link SParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementListItem(@NotNull SParser.CatchStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link SParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementListItem(@NotNull SParser.CatchStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link SParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementList(@NotNull SParser.CatchStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link SParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementList(@NotNull SParser.CatchStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRangeLiteral(@NotNull SParser.LiteralRangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRangeLiteral(@NotNull SParser.LiteralRangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListLiteral(@NotNull SParser.LiteralListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListLiteral(@NotNull SParser.LiteralListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSetLiteral(@NotNull SParser.LiteralSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link SParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSetLiteral(@NotNull SParser.LiteralSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMinIntegerLiteral(@NotNull SParser.MinIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMinIntegerLiteral(@NotNull SParser.MinIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMaxIntegerLiteral(@NotNull SParser.MaxIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMaxIntegerLiteral(@NotNull SParser.MaxIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull SParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull SParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull SParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull SParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(@NotNull SParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(@NotNull SParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull SParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull SParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(@NotNull SParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(@NotNull SParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(@NotNull SParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(@NotNull SParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull SParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull SParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(@NotNull SParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(@NotNull SParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull SParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull SParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterPeriodLiteral(@NotNull SParser.PeriodLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitPeriodLiteral(@NotNull SParser.PeriodLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull SParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link SParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull SParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link SParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(@NotNull SParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link SParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(@NotNull SParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link SParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListItem(@NotNull SParser.LiteralListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link SParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListItem(@NotNull SParser.LiteralListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull SParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull SParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull SParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull SParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull SParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull SParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull SParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull SParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expression(@NotNull SParser.This_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expression(@NotNull SParser.This_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(@NotNull SParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(@NotNull SParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link SParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLiteral(@NotNull SParser.AtomicLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link SParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLiteral(@NotNull SParser.AtomicLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link SParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull SParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link SParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull SParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(@NotNull SParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(@NotNull SParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(@NotNull SParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(@NotNull SParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(@NotNull SParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(@NotNull SParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(@NotNull SParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(@NotNull SParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteral(@NotNull SParser.TupleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link SParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteral(@NotNull SParser.TupleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(@NotNull SParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(@NotNull SParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(@NotNull SParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(@NotNull SParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link SParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTupleItem(@NotNull SParser.ValueTupleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link SParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTupleItem(@NotNull SParser.ValueTupleItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link SParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(@NotNull SParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link SParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(@NotNull SParser.ValueTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link SParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryList(@NotNull SParser.DictEntryListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link SParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryList(@NotNull SParser.DictEntryListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link SParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryListItem(@NotNull SParser.DictEntryListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link SParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryListItem(@NotNull SParser.DictEntryListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(@NotNull SParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(@NotNull SParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstAndLast(@NotNull SParser.SliceFirstAndLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstAndLast(@NotNull SParser.SliceFirstAndLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstOnly(@NotNull SParser.SliceFirstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstOnly(@NotNull SParser.SliceFirstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceLastOnly(@NotNull SParser.SliceLastOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link SParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceLastOnly(@NotNull SParser.SliceLastOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_statement(@NotNull SParser.Assign_variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_statement(@NotNull SParser.Assign_variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link SParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterRootInstance(@NotNull SParser.RootInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link SParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitRootInstance(@NotNull SParser.RootInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link SParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterChildInstance(@NotNull SParser.ChildInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link SParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitChildInstance(@NotNull SParser.ChildInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link SParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsATypeExpression(@NotNull SParser.IsATypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link SParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsATypeExpression(@NotNull SParser.IsATypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link SParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsOtherExpression(@NotNull SParser.IsOtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link SParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsOtherExpression(@NotNull SParser.IsOtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlus(@NotNull SParser.OperatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlus(@NotNull SParser.OperatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMinus(@NotNull SParser.OperatorMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMinus(@NotNull SParser.OperatorMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMultiply(@NotNull SParser.OperatorMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMultiply(@NotNull SParser.OperatorMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDivide(@NotNull SParser.OperatorDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDivide(@NotNull SParser.OperatorDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIDivide(@NotNull SParser.OperatorIDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIDivide(@NotNull SParser.OperatorIDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorModulo(@NotNull SParser.OperatorModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link SParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorModulo(@NotNull SParser.OperatorModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#key_token}.
	 * @param ctx the parse tree
	 */
	void enterKey_token(@NotNull SParser.Key_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#key_token}.
	 * @param ctx the parse tree
	 */
	void exitKey_token(@NotNull SParser.Key_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#value_token}.
	 * @param ctx the parse tree
	 */
	void enterValue_token(@NotNull SParser.Value_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#value_token}.
	 * @param ctx the parse tree
	 */
	void exitValue_token(@NotNull SParser.Value_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_token(@NotNull SParser.Symbols_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_token(@NotNull SParser.Symbols_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull SParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull SParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull SParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull SParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#idivide}.
	 * @param ctx the parse tree
	 */
	void enterIdivide(@NotNull SParser.IdivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#idivide}.
	 * @param ctx the parse tree
	 */
	void exitIdivide(@NotNull SParser.IdivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull SParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull SParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link SParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptReturnStatement(@NotNull SParser.JavascriptReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link SParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptReturnStatement(@NotNull SParser.JavascriptReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link SParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptStatement(@NotNull SParser.JavascriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link SParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptStatement(@NotNull SParser.JavascriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link SParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptPrimaryExpression(@NotNull SParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link SParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptPrimaryExpression(@NotNull SParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link SParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptSelectorExpression(@NotNull SParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link SParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptSelectorExpression(@NotNull SParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptParenthesisExpression(@NotNull SParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptParenthesisExpression(@NotNull SParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifierExpression(@NotNull SParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifierExpression(@NotNull SParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptLiteralExpression(@NotNull SParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link SParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptLiteralExpression(@NotNull SParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link SParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptMethodExpression(@NotNull SParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link SParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptMethodExpression(@NotNull SParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link SParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptItemExpression(@NotNull SParser.JavascriptItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link SParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptItemExpression(@NotNull SParser.JavascriptItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_method_expression(@NotNull SParser.Javascript_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_method_expression(@NotNull SParser.Javascript_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link SParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentListItem(@NotNull SParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link SParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentListItem(@NotNull SParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link SParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentList(@NotNull SParser.JavascriptArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link SParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentList(@NotNull SParser.JavascriptArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_item_expression(@NotNull SParser.Javascript_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_item_expression(@NotNull SParser.Javascript_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_parenthesis_expression(@NotNull SParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_parenthesis_expression(@NotNull SParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link SParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptChildIdentifier(@NotNull SParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link SParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptChildIdentifier(@NotNull SParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link SParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifier(@NotNull SParser.JavascriptIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link SParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifier(@NotNull SParser.JavascriptIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIntegerLiteral(@NotNull SParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIntegerLiteral(@NotNull SParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptDecimalLiteral(@NotNull SParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptDecimalLiteral(@NotNull SParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptTextLiteral(@NotNull SParser.JavascriptTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptTextLiteral(@NotNull SParser.JavascriptTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptBooleanLiteral(@NotNull SParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptBooleanLiteral(@NotNull SParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptCharacterLiteral(@NotNull SParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link SParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptCharacterLiteral(@NotNull SParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier(@NotNull SParser.Javascript_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier(@NotNull SParser.Javascript_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link SParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturnStatement(@NotNull SParser.PythonReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link SParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturnStatement(@NotNull SParser.PythonReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link SParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(@NotNull SParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link SParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(@NotNull SParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link SParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPrimaryExpression(@NotNull SParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link SParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPrimaryExpression(@NotNull SParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link SParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelectorExpression(@NotNull SParser.PythonSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link SParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelectorExpression(@NotNull SParser.PythonSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonParenthesisExpression(@NotNull SParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonParenthesisExpression(@NotNull SParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifierExpression(@NotNull SParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifierExpression(@NotNull SParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonLiteralExpression(@NotNull SParser.PythonLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonLiteralExpression(@NotNull SParser.PythonLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonGlobalMethodExpression(@NotNull SParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link SParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonGlobalMethodExpression(@NotNull SParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link SParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonMethodExpression(@NotNull SParser.PythonMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link SParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonMethodExpression(@NotNull SParser.PythonMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link SParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonItemExpression(@NotNull SParser.PythonItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link SParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonItemExpression(@NotNull SParser.PythonItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_method_expression(@NotNull SParser.Python_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_method_expression(@NotNull SParser.Python_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalOnlyArgumentList(@NotNull SParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalOnlyArgumentList(@NotNull SParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedOnlyArgumentList(@NotNull SParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedOnlyArgumentList(@NotNull SParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgumentList(@NotNull SParser.PythonArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link SParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgumentList(@NotNull SParser.PythonArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link SParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentListItem(@NotNull SParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link SParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentListItem(@NotNull SParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link SParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentList(@NotNull SParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link SParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentList(@NotNull SParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link SParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentListItem(@NotNull SParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link SParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentListItem(@NotNull SParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link SParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentList(@NotNull SParser.PythonNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link SParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentList(@NotNull SParser.PythonNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_parenthesis_expression(@NotNull SParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_parenthesis_expression(@NotNull SParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link SParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonChildIdentifier(@NotNull SParser.PythonChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link SParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonChildIdentifier(@NotNull SParser.PythonChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link SParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifier(@NotNull SParser.PythonIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link SParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifier(@NotNull SParser.PythonIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIntegerLiteral(@NotNull SParser.PythonIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIntegerLiteral(@NotNull SParser.PythonIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecimalLiteral(@NotNull SParser.PythonDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecimalLiteral(@NotNull SParser.PythonDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonTextLiteral(@NotNull SParser.PythonTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonTextLiteral(@NotNull SParser.PythonTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonBooleanLiteral(@NotNull SParser.PythonBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonBooleanLiteral(@NotNull SParser.PythonBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonCharacterLiteral(@NotNull SParser.PythonCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link SParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonCharacterLiteral(@NotNull SParser.PythonCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPython_identifier(@NotNull SParser.Python_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPython_identifier(@NotNull SParser.Python_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link SParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaReturnStatement(@NotNull SParser.JavaReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link SParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaReturnStatement(@NotNull SParser.JavaReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link SParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaStatement(@NotNull SParser.JavaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link SParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaStatement(@NotNull SParser.JavaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link SParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaPrimaryExpression(@NotNull SParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link SParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaPrimaryExpression(@NotNull SParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link SParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaSelectorExpression(@NotNull SParser.JavaSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link SParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaSelectorExpression(@NotNull SParser.JavaSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaParenthesisExpression(@NotNull SParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaParenthesisExpression(@NotNull SParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifierExpression(@NotNull SParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifierExpression(@NotNull SParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaLiteralExpression(@NotNull SParser.JavaLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link SParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaLiteralExpression(@NotNull SParser.JavaLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link SParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaMethodExpression(@NotNull SParser.JavaMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link SParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaMethodExpression(@NotNull SParser.JavaMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link SParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaItemExpression(@NotNull SParser.JavaItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link SParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaItemExpression(@NotNull SParser.JavaItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_method_expression(@NotNull SParser.Java_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_method_expression(@NotNull SParser.Java_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link SParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentList(@NotNull SParser.JavaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link SParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentList(@NotNull SParser.JavaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link SParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentListItem(@NotNull SParser.JavaArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link SParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentListItem(@NotNull SParser.JavaArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_item_expression(@NotNull SParser.Java_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_item_expression(@NotNull SParser.Java_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_parenthesis_expression(@NotNull SParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_parenthesis_expression(@NotNull SParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link SParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifier(@NotNull SParser.JavaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link SParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifier(@NotNull SParser.JavaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link SParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildIdentifier(@NotNull SParser.JavaChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link SParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildIdentifier(@NotNull SParser.JavaChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link SParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildClassIdentifier(@NotNull SParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link SParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildClassIdentifier(@NotNull SParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link SParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaClassIdentifier(@NotNull SParser.JavaClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link SParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaClassIdentifier(@NotNull SParser.JavaClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIntegerLiteral(@NotNull SParser.JavaIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIntegerLiteral(@NotNull SParser.JavaIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaDecimalLiteral(@NotNull SParser.JavaDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaDecimalLiteral(@NotNull SParser.JavaDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaTextLiteral(@NotNull SParser.JavaTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaTextLiteral(@NotNull SParser.JavaTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaBooleanLiteral(@NotNull SParser.JavaBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaBooleanLiteral(@NotNull SParser.JavaBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCharacterLiteral(@NotNull SParser.JavaCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link SParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCharacterLiteral(@NotNull SParser.JavaCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJava_identifier(@NotNull SParser.Java_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJava_identifier(@NotNull SParser.Java_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link SParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpReturnStatement(@NotNull SParser.CSharpReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link SParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpReturnStatement(@NotNull SParser.CSharpReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link SParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpStatement(@NotNull SParser.CSharpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link SParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpStatement(@NotNull SParser.CSharpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link SParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPrimaryExpression(@NotNull SParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link SParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPrimaryExpression(@NotNull SParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link SParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpSelectorExpression(@NotNull SParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link SParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpSelectorExpression(@NotNull SParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpParenthesisExpression(@NotNull SParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpParenthesisExpression(@NotNull SParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifierExpression(@NotNull SParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifierExpression(@NotNull SParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpLiteralExpression(@NotNull SParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link SParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpLiteralExpression(@NotNull SParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link SParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpMethodExpression(@NotNull SParser.CSharpMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link SParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpMethodExpression(@NotNull SParser.CSharpMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link SParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpItemExpression(@NotNull SParser.CSharpItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link SParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpItemExpression(@NotNull SParser.CSharpItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_method_expression(@NotNull SParser.Csharp_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_method_expression(@NotNull SParser.Csharp_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link SParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentList(@NotNull SParser.CSharpArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link SParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentList(@NotNull SParser.CSharpArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link SParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentListItem(@NotNull SParser.CSharpArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link SParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentListItem(@NotNull SParser.CSharpArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_item_expression(@NotNull SParser.Csharp_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_item_expression(@NotNull SParser.Csharp_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_parenthesis_expression(@NotNull SParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_parenthesis_expression(@NotNull SParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link SParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifier(@NotNull SParser.CSharpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link SParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifier(@NotNull SParser.CSharpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link SParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpChildIdentifier(@NotNull SParser.CSharpChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link SParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpChildIdentifier(@NotNull SParser.CSharpChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIntegerLiteral(@NotNull SParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIntegerLiteral(@NotNull SParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpDecimalLiteral(@NotNull SParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpDecimalLiteral(@NotNull SParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpTextLiteral(@NotNull SParser.CSharpTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpTextLiteral(@NotNull SParser.CSharpTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpBooleanLiteral(@NotNull SParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpBooleanLiteral(@NotNull SParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCharacterLiteral(@NotNull SParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link SParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCharacterLiteral(@NotNull SParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_identifier(@NotNull SParser.Csharp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_identifier(@NotNull SParser.Csharp_identifierContext ctx);
}