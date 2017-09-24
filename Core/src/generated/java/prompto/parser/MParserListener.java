// Generated from MParser.g4 by ANTLR 4.5
package prompto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MParser}.
 */
public interface MParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_category_declaration(@NotNull MParser.Enum_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_category_declaration(@NotNull MParser.Enum_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_native_declaration(@NotNull MParser.Enum_native_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_native_declaration(@NotNull MParser.Enum_native_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol(@NotNull MParser.Native_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol(@NotNull MParser.Native_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol(@NotNull MParser.Category_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol(@NotNull MParser.Category_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull MParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull MParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#index_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_clause(@NotNull MParser.Index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#index_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_clause(@NotNull MParser.Index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_category_declaration(@NotNull MParser.Concrete_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_category_declaration(@NotNull MParser.Concrete_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_category_declaration(@NotNull MParser.Singleton_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_category_declaration(@NotNull MParser.Singleton_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerived_list(@NotNull MParser.Derived_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerived_list(@NotNull MParser.Derived_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_method_declaration(@NotNull MParser.Operator_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_method_declaration(@NotNull MParser.Operator_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetter_method_declaration(@NotNull MParser.Setter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetter_method_declaration(@NotNull MParser.Setter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_setter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_setter_declaration(@NotNull MParser.Native_setter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_setter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_setter_declaration(@NotNull MParser.Native_setter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetter_method_declaration(@NotNull MParser.Getter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetter_method_declaration(@NotNull MParser.Getter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_getter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_getter_declaration(@NotNull MParser.Native_getter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_getter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_getter_declaration(@NotNull MParser.Native_getter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_declaration(@NotNull MParser.Native_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_declaration(@NotNull MParser.Native_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_resource_declaration(@NotNull MParser.Native_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_resource_declaration(@NotNull MParser.Native_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_category_bindings}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_bindings(@NotNull MParser.Native_category_bindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_category_bindings}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_bindings(@NotNull MParser.Native_category_bindingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryBindingListItem}
	 * labeled alternative in {@link MParser#native_category_binding_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryBindingListItem(@NotNull MParser.NativeCategoryBindingListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryBindingListItem}
	 * labeled alternative in {@link MParser#native_category_binding_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryBindingListItem(@NotNull MParser.NativeCategoryBindingListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryBindingList}
	 * labeled alternative in {@link MParser#native_category_binding_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryBindingList(@NotNull MParser.NativeCategoryBindingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryBindingList}
	 * labeled alternative in {@link MParser#native_category_binding_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryBindingList(@NotNull MParser.NativeCategoryBindingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_method_declaration(@NotNull MParser.Abstract_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_method_declaration(@NotNull MParser.Abstract_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_method_declaration(@NotNull MParser.Concrete_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_method_declaration(@NotNull MParser.Concrete_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_method_declaration(@NotNull MParser.Native_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_method_declaration(@NotNull MParser.Native_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTest_method_declaration(@NotNull MParser.Test_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#test_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTest_method_declaration(@NotNull MParser.Test_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull MParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull MParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void enterTyped_argument(@NotNull MParser.Typed_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void exitTyped_argument(@NotNull MParser.Typed_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull MParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull MParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInstanceStatement(@NotNull MParser.AssignInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInstanceStatement(@NotNull MParser.AssignInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignTupleStatement(@NotNull MParser.AssignTupleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignTupleStatement(@NotNull MParser.AssignTupleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StoreStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStoreStatement(@NotNull MParser.StoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StoreStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStoreStatement(@NotNull MParser.StoreStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlushStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(@NotNull MParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlushStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(@NotNull MParser.FlushStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull MParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull MParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull MParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull MParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull MParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull MParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull MParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull MParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull MParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull MParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(@NotNull MParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(@NotNull MParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull MParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull MParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull MParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull MParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithResourceStatement(@NotNull MParser.WithResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithResourceStatement(@NotNull MParser.WithResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithSingletonStatement(@NotNull MParser.WithSingletonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithSingletonStatement(@NotNull MParser.WithSingletonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClosureStatement(@NotNull MParser.ClosureStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClosureStatement(@NotNull MParser.ClosureStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommentStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(@NotNull MParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommentStatement}
	 * labeled alternative in {@link MParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(@NotNull MParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#flush_statement}.
	 * @param ctx the parse tree
	 */
	void enterFlush_statement(@NotNull MParser.Flush_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#flush_statement}.
	 * @param ctx the parse tree
	 */
	void exitFlush_statement(@NotNull MParser.Flush_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#store_statement}.
	 * @param ctx the parse tree
	 */
	void enterStore_statement(@NotNull MParser.Store_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#store_statement}.
	 * @param ctx the parse tree
	 */
	void exitStore_statement(@NotNull MParser.Store_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull MParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull MParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link MParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull MParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link MParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull MParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link MParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodParent(@NotNull MParser.MethodParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link MParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodParent(@NotNull MParser.MethodParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link MParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableSelector(@NotNull MParser.CallableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link MParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableSelector(@NotNull MParser.CallableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link MParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableRoot(@NotNull MParser.CallableRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link MParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableRoot(@NotNull MParser.CallableRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link MParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableMemberSelector(@NotNull MParser.CallableMemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link MParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableMemberSelector(@NotNull MParser.CallableMemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link MParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableItemSelector(@NotNull MParser.CallableItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link MParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableItemSelector(@NotNull MParser.CallableItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_resource_statement(@NotNull MParser.With_resource_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_resource_statement(@NotNull MParser.With_resource_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_singleton_statement(@NotNull MParser.With_singleton_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_singleton_statement(@NotNull MParser.With_singleton_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull MParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull MParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link MParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterAtomicSwitchCase(@NotNull MParser.AtomicSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link MParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitAtomicSwitchCase(@NotNull MParser.AtomicSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link MParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSwitchCase(@NotNull MParser.CollectionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link MParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSwitchCase(@NotNull MParser.CollectionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_statement(@NotNull MParser.For_each_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_statement(@NotNull MParser.For_each_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull MParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull MParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull MParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull MParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull MParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull MParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link MParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementList(@NotNull MParser.ElseIfStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link MParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementList(@NotNull MParser.ElseIfStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link MParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementListItem(@NotNull MParser.ElseIfStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link MParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementListItem(@NotNull MParser.ElseIfStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull MParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull MParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull MParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull MParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link MParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchAtomicStatement(@NotNull MParser.CatchAtomicStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link MParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchAtomicStatement(@NotNull MParser.CatchAtomicStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link MParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchCollectionStatement(@NotNull MParser.CatchCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link MParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchCollectionStatement(@NotNull MParser.CatchCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(@NotNull MParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(@NotNull MParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull MParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull MParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivideExpression(@NotNull MParser.IntDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivideExpression(@NotNull MParser.IntDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull MParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull MParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAllExpression(@NotNull MParser.ContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAllExpression(@NotNull MParser.ContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(@NotNull MParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(@NotNull MParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull MParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull MParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull MParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull MParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(@NotNull MParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(@NotNull MParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull MParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull MParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCodeExpression(@NotNull MParser.CodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCodeExpression(@NotNull MParser.CodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(@NotNull MParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(@NotNull MParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull MParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull MParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull MParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull MParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAnyExpression(@NotNull MParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAnyExpression(@NotNull MParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpression(@NotNull MParser.ContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpression(@NotNull MParser.ContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilteredListExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFilteredListExpression(@NotNull MParser.FilteredListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilteredListExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFilteredListExpression(@NotNull MParser.FilteredListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsExpression(@NotNull MParser.NotContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsExpression(@NotNull MParser.NotContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull MParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull MParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoughlyEqualsExpression(@NotNull MParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoughlyEqualsExpression(@NotNull MParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(@NotNull MParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(@NotNull MParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(@NotNull MParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(@NotNull MParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(@NotNull MParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(@NotNull MParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(@NotNull MParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(@NotNull MParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IteratorExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIteratorExpression(@NotNull MParser.IteratorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IteratorExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIteratorExpression(@NotNull MParser.IteratorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(@NotNull MParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(@NotNull MParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull MParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull MParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull MParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull MParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull MParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull MParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull MParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull MParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAllExpression(@NotNull MParser.NotContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAllExpression(@NotNull MParser.NotContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(@NotNull MParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(@NotNull MParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAnyExpression(@NotNull MParser.ContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAnyExpression(@NotNull MParser.ContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull MParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull MParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull MParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull MParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(@NotNull MParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(@NotNull MParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(@NotNull MParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link MParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(@NotNull MParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull MParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull MParser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link MParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull MParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link MParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull MParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link MParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectableExpression(@NotNull MParser.SelectableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link MParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectableExpression(@NotNull MParser.SelectableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterMethod_expression(@NotNull MParser.Method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitMethod_expression(@NotNull MParser.Method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelector(@NotNull MParser.MemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelector(@NotNull MParser.MemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterSliceSelector(@NotNull MParser.SliceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitSliceSelector(@NotNull MParser.SliceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void enterItemSelector(@NotNull MParser.ItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link MParser#instance_selector}.
	 * @param ctx the parse tree
	 */
	void exitItemSelector(@NotNull MParser.ItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#blob_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlob_expression(@NotNull MParser.Blob_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#blob_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlob_expression(@NotNull MParser.Blob_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocument_expression(@NotNull MParser.Document_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocument_expression(@NotNull MParser.Document_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(@NotNull MParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(@NotNull MParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignmentList(@NotNull MParser.ExpressionAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignmentList(@NotNull MParser.ExpressionAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentList(@NotNull MParser.ArgumentAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentList(@NotNull MParser.ArgumentAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListItem(@NotNull MParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link MParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListItem(@NotNull MParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArgument_assignment(@NotNull MParser.Argument_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArgument_assignment(@NotNull MParser.Argument_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull MParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull MParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#filtered_list_suffix}.
	 * @param ctx the parse tree
	 */
	void enterFiltered_list_suffix(@NotNull MParser.Filtered_list_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#filtered_list_suffix}.
	 * @param ctx the parse tree
	 */
	void exitFiltered_list_suffix(@NotNull MParser.Filtered_list_suffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchOne}
	 * labeled alternative in {@link MParser#fetch_store_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchOne(@NotNull MParser.FetchOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchOne}
	 * labeled alternative in {@link MParser#fetch_store_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchOne(@NotNull MParser.FetchOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchMany}
	 * labeled alternative in {@link MParser#fetch_store_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchMany(@NotNull MParser.FetchManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchMany}
	 * labeled alternative in {@link MParser#fetch_store_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchMany(@NotNull MParser.FetchManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void enterSorted_expression(@NotNull MParser.Sorted_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void exitSorted_expression(@NotNull MParser.Sorted_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instance_statement(@NotNull MParser.Assign_instance_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instance_statement(@NotNull MParser.Assign_instance_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link MParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterMemberInstance(@NotNull MParser.MemberInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link MParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitMemberInstance(@NotNull MParser.MemberInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link MParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterItemInstance(@NotNull MParser.ItemInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link MParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitItemInstance(@NotNull MParser.ItemInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tuple_statement(@NotNull MParser.Assign_tuple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tuple_statement(@NotNull MParser.Assign_tuple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#lfs}.
	 * @param ctx the parse tree
	 */
	void enterLfs(@NotNull MParser.LfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#lfs}.
	 * @param ctx the parse tree
	 */
	void exitLfs(@NotNull MParser.LfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#lfp}.
	 * @param ctx the parse tree
	 */
	void enterLfp(@NotNull MParser.LfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#lfp}.
	 * @param ctx the parse tree
	 */
	void exitLfp(@NotNull MParser.LfpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(@NotNull MParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(@NotNull MParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#dedent}.
	 * @param ctx the parse tree
	 */
	void enterDedent(@NotNull MParser.DedentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#dedent}.
	 * @param ctx the parse tree
	 */
	void exitDedent(@NotNull MParser.DedentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(@NotNull MParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(@NotNull MParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link MParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFullDeclarationList(@NotNull MParser.FullDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link MParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFullDeclarationList(@NotNull MParser.FullDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull MParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull MParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull MParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull MParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(@NotNull MParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(@NotNull MParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(@NotNull MParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(@NotNull MParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol_list(@NotNull MParser.Native_symbol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol_list(@NotNull MParser.Native_symbol_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol_list(@NotNull MParser.Category_symbol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol_list(@NotNull MParser.Category_symbol_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_list(@NotNull MParser.Symbol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_list(@NotNull MParser.Symbol_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingList(@NotNull MParser.MatchingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingList(@NotNull MParser.MatchingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingSet(@NotNull MParser.MatchingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingSet(@NotNull MParser.MatchingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingRange(@NotNull MParser.MatchingRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingRange(@NotNull MParser.MatchingRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingPattern(@NotNull MParser.MatchingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingPattern(@NotNull MParser.MatchingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingExpression(@NotNull MParser.MatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link MParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingExpression(@NotNull MParser.MatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull MParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull MParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(@NotNull MParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(@NotNull MParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull MParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull MParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void enterRange_literal(@NotNull MParser.Range_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void exitRange_literal(@NotNull MParser.Range_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IteratorType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterIteratorType(@NotNull MParser.IteratorTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IteratorType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitIteratorType(@NotNull MParser.IteratorTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull MParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull MParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull MParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull MParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterDictType(@NotNull MParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitDictType(@NotNull MParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CursorType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterCursorType(@NotNull MParser.CursorTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CursorType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitCursorType(@NotNull MParser.CursorTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(@NotNull MParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link MParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(@NotNull MParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link MParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(@NotNull MParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link MParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(@NotNull MParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link MParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryType(@NotNull MParser.CategoryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link MParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryType(@NotNull MParser.CategoryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull MParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull MParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull MParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull MParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(@NotNull MParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(@NotNull MParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterImageType(@NotNull MParser.ImageTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitImageType(@NotNull MParser.ImageTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull MParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull MParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(@NotNull MParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(@NotNull MParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocumentType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDocumentType(@NotNull MParser.DocumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDocumentType(@NotNull MParser.DocumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull MParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull MParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(@NotNull MParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(@NotNull MParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(@NotNull MParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(@NotNull MParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterPeriodType(@NotNull MParser.PeriodTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitPeriodType(@NotNull MParser.PeriodTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VersionType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterVersionType(@NotNull MParser.VersionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VersionType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitVersionType(@NotNull MParser.VersionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCodeType(@NotNull MParser.CodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCodeType(@NotNull MParser.CodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlobType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBlobType(@NotNull MParser.BlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlobType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBlobType(@NotNull MParser.BlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UUIDType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterUUIDType(@NotNull MParser.UUIDTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UUIDType}
	 * labeled alternative in {@link MParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitUUIDType(@NotNull MParser.UUIDTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#category_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_type(@NotNull MParser.Category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#category_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_type(@NotNull MParser.Category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#mutable_category_type}.
	 * @param ctx the parse tree
	 */
	void enterMutable_category_type(@NotNull MParser.Mutable_category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#mutable_category_type}.
	 * @param ctx the parse tree
	 */
	void exitMutable_category_type(@NotNull MParser.Mutable_category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#code_type}.
	 * @param ctx the parse tree
	 */
	void enterCode_type(@NotNull MParser.Code_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#code_type}.
	 * @param ctx the parse tree
	 */
	void exitCode_type(@NotNull MParser.Code_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteCategoryDeclaration(@NotNull MParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteCategoryDeclaration(@NotNull MParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryDeclaration(@NotNull MParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryDeclaration(@NotNull MParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingletonCategoryDeclaration(@NotNull MParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link MParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingletonCategoryDeclaration(@NotNull MParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier_list(@NotNull MParser.Type_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier_list(@NotNull MParser.Type_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_identifier(@NotNull MParser.Method_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_identifier(@NotNull MParser.Method_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull MParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull MParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull MParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull MParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbolIdentifier(@NotNull MParser.SymbolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link MParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbolIdentifier(@NotNull MParser.SymbolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull MParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull MParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#attribute_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_identifier(@NotNull MParser.Attribute_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#attribute_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_identifier(@NotNull MParser.Attribute_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull MParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull MParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_identifier(@NotNull MParser.Symbol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_identifier(@NotNull MParser.Symbol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull MParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull MParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link MParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterCodeArgument(@NotNull MParser.CodeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link MParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitCodeArgument(@NotNull MParser.CodeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link MParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArgument(@NotNull MParser.OperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link MParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArgument(@NotNull MParser.OperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterOperator_argument(@NotNull MParser.Operator_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitOperator_argument(@NotNull MParser.Operator_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(@NotNull MParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(@NotNull MParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void enterCode_argument(@NotNull MParser.Code_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void exitCode_argument(@NotNull MParser.Code_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_or_any_type(@NotNull MParser.Category_or_any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_or_any_type(@NotNull MParser.Category_or_any_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyListType(@NotNull MParser.AnyListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyListType(@NotNull MParser.AnyListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(@NotNull MParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(@NotNull MParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyDictType(@NotNull MParser.AnyDictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link MParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyDictType(@NotNull MParser.AnyDictTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_method_declaration_list(@NotNull MParser.Member_method_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_method_declaration_list(@NotNull MParser.Member_method_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_method_declaration(@NotNull MParser.Member_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_method_declaration(@NotNull MParser.Member_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterNative_member_method_declaration_list(@NotNull MParser.Native_member_method_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_member_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitNative_member_method_declaration_list(@NotNull MParser.Native_member_method_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_member_method_declaration(@NotNull MParser.Native_member_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_member_method_declaration(@NotNull MParser.Native_member_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterJavaCategoryBinding(@NotNull MParser.JavaCategoryBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitJavaCategoryBinding(@NotNull MParser.JavaCategoryBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCategoryBinding(@NotNull MParser.CSharpCategoryBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCategoryBinding(@NotNull MParser.CSharpCategoryBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2CategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterPython2CategoryBinding(@NotNull MParser.Python2CategoryBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2CategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitPython2CategoryBinding(@NotNull MParser.Python2CategoryBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3CategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterPython3CategoryBinding(@NotNull MParser.Python3CategoryBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3CategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitPython3CategoryBinding(@NotNull MParser.Python3CategoryBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptCategoryBinding(@NotNull MParser.JavaScriptCategoryBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptCategoryBinding}
	 * labeled alternative in {@link MParser#native_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptCategoryBinding(@NotNull MParser.JavaScriptCategoryBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterPython_category_binding(@NotNull MParser.Python_category_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitPython_category_binding(@NotNull MParser.Python_category_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_module}.
	 * @param ctx the parse tree
	 */
	void enterPython_module(@NotNull MParser.Python_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_module}.
	 * @param ctx the parse tree
	 */
	void exitPython_module(@NotNull MParser.Python_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_category_binding}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_category_binding(@NotNull MParser.Javascript_category_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_category_binding}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_category_binding(@NotNull MParser.Javascript_category_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_module(@NotNull MParser.Javascript_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_module(@NotNull MParser.Javascript_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier_list(@NotNull MParser.Variable_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier_list(@NotNull MParser.Variable_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#attribute_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_identifier_list(@NotNull MParser.Attribute_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#attribute_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_identifier_list(@NotNull MParser.Attribute_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull MParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull MParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_statement(@NotNull MParser.Comment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_statement(@NotNull MParser.Comment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNative_statement_list(@NotNull MParser.Native_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNative_statement_list(@NotNull MParser.Native_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaNativeStatement(@NotNull MParser.JavaNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaNativeStatement(@NotNull MParser.JavaNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpNativeStatement(@NotNull MParser.CSharpNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpNativeStatement(@NotNull MParser.CSharpNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython2NativeStatement(@NotNull MParser.Python2NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython2NativeStatement(@NotNull MParser.Python2NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython3NativeStatement(@NotNull MParser.Python3NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython3NativeStatement(@NotNull MParser.Python3NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptNativeStatement(@NotNull MParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link MParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptNativeStatement(@NotNull MParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython_native_statement(@NotNull MParser.Python_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython_native_statement(@NotNull MParser.Python_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_native_statement(@NotNull MParser.Javascript_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_native_statement(@NotNull MParser.Javascript_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(@NotNull MParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(@NotNull MParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_list(@NotNull MParser.Assertion_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assertion_list}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_list(@NotNull MParser.Assertion_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case_statement_list(@NotNull MParser.Switch_case_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case_statement_list(@NotNull MParser.Switch_case_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement_list(@NotNull MParser.Catch_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement_list(@NotNull MParser.Catch_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRangeLiteral(@NotNull MParser.LiteralRangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRangeLiteral(@NotNull MParser.LiteralRangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListLiteral(@NotNull MParser.LiteralListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListLiteral(@NotNull MParser.LiteralListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSetLiteral(@NotNull MParser.LiteralSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link MParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSetLiteral(@NotNull MParser.LiteralSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMinIntegerLiteral(@NotNull MParser.MinIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMinIntegerLiteral(@NotNull MParser.MinIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMaxIntegerLiteral(@NotNull MParser.MaxIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMaxIntegerLiteral(@NotNull MParser.MaxIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull MParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull MParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull MParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull MParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(@NotNull MParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(@NotNull MParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull MParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull MParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(@NotNull MParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(@NotNull MParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(@NotNull MParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(@NotNull MParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull MParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull MParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(@NotNull MParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(@NotNull MParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull MParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull MParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterPeriodLiteral(@NotNull MParser.PeriodLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitPeriodLiteral(@NotNull MParser.PeriodLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VersionLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterVersionLiteral(@NotNull MParser.VersionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VersionLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitVersionLiteral(@NotNull MParser.VersionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UUIDLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterUUIDLiteral(@NotNull MParser.UUIDLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UUIDLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitUUIDLiteral(@NotNull MParser.UUIDLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull MParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link MParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull MParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_list_literal(@NotNull MParser.Literal_list_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_list_literal(@NotNull MParser.Literal_list_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull MParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull MParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull MParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull MParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull MParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull MParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull MParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link MParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull MParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expression(@NotNull MParser.This_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expression(@NotNull MParser.This_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(@NotNull MParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(@NotNull MParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(@NotNull MParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(@NotNull MParser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterCollection_literal(@NotNull MParser.Collection_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitCollection_literal(@NotNull MParser.Collection_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(@NotNull MParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(@NotNull MParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(@NotNull MParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(@NotNull MParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterExpression_tuple(@NotNull MParser.Expression_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitExpression_tuple(@NotNull MParser.Expression_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry_list(@NotNull MParser.Dict_entry_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry_list(@NotNull MParser.Dict_entry_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(@NotNull MParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(@NotNull MParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstAndLast(@NotNull MParser.SliceFirstAndLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstAndLast(@NotNull MParser.SliceFirstAndLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstOnly(@NotNull MParser.SliceFirstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstOnly(@NotNull MParser.SliceFirstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceLastOnly(@NotNull MParser.SliceLastOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link MParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceLastOnly(@NotNull MParser.SliceLastOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_statement(@NotNull MParser.Assign_variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_statement(@NotNull MParser.Assign_variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link MParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterChildInstance(@NotNull MParser.ChildInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link MParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitChildInstance(@NotNull MParser.ChildInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link MParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterRootInstance(@NotNull MParser.RootInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link MParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitRootInstance(@NotNull MParser.RootInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link MParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsATypeExpression(@NotNull MParser.IsATypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link MParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsATypeExpression(@NotNull MParser.IsATypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link MParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsOtherExpression(@NotNull MParser.IsOtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link MParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsOtherExpression(@NotNull MParser.IsOtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#read_all_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_all_expression(@NotNull MParser.Read_all_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#read_all_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_all_expression(@NotNull MParser.Read_all_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#read_one_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_one_expression(@NotNull MParser.Read_one_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#read_one_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_one_expression(@NotNull MParser.Read_one_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_list(@NotNull MParser.Order_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_list(@NotNull MParser.Order_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(@NotNull MParser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(@NotNull MParser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlus(@NotNull MParser.OperatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlus(@NotNull MParser.OperatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMinus(@NotNull MParser.OperatorMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMinus(@NotNull MParser.OperatorMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMultiply(@NotNull MParser.OperatorMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMultiply(@NotNull MParser.OperatorMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDivide(@NotNull MParser.OperatorDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDivide(@NotNull MParser.OperatorDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIDivide(@NotNull MParser.OperatorIDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIDivide(@NotNull MParser.OperatorIDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorModulo(@NotNull MParser.OperatorModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link MParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorModulo(@NotNull MParser.OperatorModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#new_token}.
	 * @param ctx the parse tree
	 */
	void enterNew_token(@NotNull MParser.New_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#new_token}.
	 * @param ctx the parse tree
	 */
	void exitNew_token(@NotNull MParser.New_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#key_token}.
	 * @param ctx the parse tree
	 */
	void enterKey_token(@NotNull MParser.Key_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#key_token}.
	 * @param ctx the parse tree
	 */
	void exitKey_token(@NotNull MParser.Key_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#module_token}.
	 * @param ctx the parse tree
	 */
	void enterModule_token(@NotNull MParser.Module_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#module_token}.
	 * @param ctx the parse tree
	 */
	void exitModule_token(@NotNull MParser.Module_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#value_token}.
	 * @param ctx the parse tree
	 */
	void enterValue_token(@NotNull MParser.Value_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#value_token}.
	 * @param ctx the parse tree
	 */
	void exitValue_token(@NotNull MParser.Value_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_token(@NotNull MParser.Symbols_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_token(@NotNull MParser.Symbols_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull MParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull MParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull MParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull MParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull MParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull MParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#idivide}.
	 * @param ctx the parse tree
	 */
	void enterIdivide(@NotNull MParser.IdivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#idivide}.
	 * @param ctx the parse tree
	 */
	void exitIdivide(@NotNull MParser.IdivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull MParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull MParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link MParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptReturnStatement(@NotNull MParser.JavascriptReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link MParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptReturnStatement(@NotNull MParser.JavascriptReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link MParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptStatement(@NotNull MParser.JavascriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link MParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptStatement(@NotNull MParser.JavascriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link MParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptSelectorExpression(@NotNull MParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link MParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptSelectorExpression(@NotNull MParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link MParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptPrimaryExpression(@NotNull MParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link MParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptPrimaryExpression(@NotNull MParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_primary_expression(@NotNull MParser.Javascript_primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_primary_expression(@NotNull MParser.Javascript_primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_this_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_this_expression(@NotNull MParser.Javascript_this_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_this_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_this_expression(@NotNull MParser.Javascript_this_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_new_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_new_expression(@NotNull MParser.Javascript_new_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_new_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_new_expression(@NotNull MParser.Javascript_new_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptMethodExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptMethodExpression(@NotNull MParser.JavaScriptMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptMethodExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptMethodExpression(@NotNull MParser.JavaScriptMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptMemberExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptMemberExpression(@NotNull MParser.JavaScriptMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptMemberExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptMemberExpression(@NotNull MParser.JavaScriptMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptItemExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptItemExpression(@NotNull MParser.JavaScriptItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptItemExpression}
	 * labeled alternative in {@link MParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptItemExpression(@NotNull MParser.JavaScriptItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_method_expression(@NotNull MParser.Javascript_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_method_expression(@NotNull MParser.Javascript_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link MParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentList(@NotNull MParser.JavascriptArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link MParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentList(@NotNull MParser.JavascriptArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link MParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentListItem(@NotNull MParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link MParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentListItem(@NotNull MParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_item_expression(@NotNull MParser.Javascript_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_item_expression(@NotNull MParser.Javascript_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_parenthesis_expression(@NotNull MParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_parenthesis_expression(@NotNull MParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier_expression(@NotNull MParser.Javascript_identifier_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier_expression(@NotNull MParser.Javascript_identifier_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIntegerLiteral(@NotNull MParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIntegerLiteral(@NotNull MParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptDecimalLiteral(@NotNull MParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptDecimalLiteral(@NotNull MParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptTextLiteral(@NotNull MParser.JavascriptTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptTextLiteral(@NotNull MParser.JavascriptTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptBooleanLiteral(@NotNull MParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptBooleanLiteral(@NotNull MParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptCharacterLiteral(@NotNull MParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link MParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptCharacterLiteral(@NotNull MParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier(@NotNull MParser.Javascript_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier(@NotNull MParser.Javascript_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link MParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturnStatement(@NotNull MParser.PythonReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link MParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturnStatement(@NotNull MParser.PythonReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link MParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(@NotNull MParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link MParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(@NotNull MParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link MParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelectorExpression(@NotNull MParser.PythonSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link MParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelectorExpression(@NotNull MParser.PythonSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link MParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPrimaryExpression(@NotNull MParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link MParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPrimaryExpression(@NotNull MParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelfExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelfExpression(@NotNull MParser.PythonSelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelfExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelfExpression(@NotNull MParser.PythonSelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonParenthesisExpression(@NotNull MParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonParenthesisExpression(@NotNull MParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifierExpression(@NotNull MParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifierExpression(@NotNull MParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonLiteralExpression(@NotNull MParser.PythonLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonLiteralExpression(@NotNull MParser.PythonLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonGlobalMethodExpression(@NotNull MParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link MParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonGlobalMethodExpression(@NotNull MParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_self_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_self_expression(@NotNull MParser.Python_self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_self_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_self_expression(@NotNull MParser.Python_self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link MParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonMethodExpression(@NotNull MParser.PythonMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link MParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonMethodExpression(@NotNull MParser.PythonMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link MParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonItemExpression(@NotNull MParser.PythonItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link MParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonItemExpression(@NotNull MParser.PythonItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_method_expression(@NotNull MParser.Python_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_method_expression(@NotNull MParser.Python_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalOnlyArgumentList(@NotNull MParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalOnlyArgumentList(@NotNull MParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedOnlyArgumentList(@NotNull MParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedOnlyArgumentList(@NotNull MParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgumentList(@NotNull MParser.PythonArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link MParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgumentList(@NotNull MParser.PythonArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link MParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentList(@NotNull MParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link MParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentList(@NotNull MParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link MParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentListItem(@NotNull MParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link MParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentListItem(@NotNull MParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link MParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentList(@NotNull MParser.PythonNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link MParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentList(@NotNull MParser.PythonNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link MParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentListItem(@NotNull MParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link MParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentListItem(@NotNull MParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_parenthesis_expression(@NotNull MParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_parenthesis_expression(@NotNull MParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonChildIdentifier(@NotNull MParser.PythonChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonChildIdentifier(@NotNull MParser.PythonChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPromptoIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPromptoIdentifier(@NotNull MParser.PythonPromptoIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPromptoIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPromptoIdentifier(@NotNull MParser.PythonPromptoIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifier(@NotNull MParser.PythonIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link MParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifier(@NotNull MParser.PythonIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIntegerLiteral(@NotNull MParser.PythonIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIntegerLiteral(@NotNull MParser.PythonIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecimalLiteral(@NotNull MParser.PythonDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecimalLiteral(@NotNull MParser.PythonDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonTextLiteral(@NotNull MParser.PythonTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonTextLiteral(@NotNull MParser.PythonTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonBooleanLiteral(@NotNull MParser.PythonBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonBooleanLiteral(@NotNull MParser.PythonBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonCharacterLiteral(@NotNull MParser.PythonCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link MParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonCharacterLiteral(@NotNull MParser.PythonCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPython_identifier(@NotNull MParser.Python_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPython_identifier(@NotNull MParser.Python_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link MParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaReturnStatement(@NotNull MParser.JavaReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link MParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaReturnStatement(@NotNull MParser.JavaReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link MParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaStatement(@NotNull MParser.JavaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link MParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaStatement(@NotNull MParser.JavaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link MParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaSelectorExpression(@NotNull MParser.JavaSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link MParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaSelectorExpression(@NotNull MParser.JavaSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link MParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaPrimaryExpression(@NotNull MParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link MParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaPrimaryExpression(@NotNull MParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_primary_expression(@NotNull MParser.Java_primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_primary_expression(@NotNull MParser.Java_primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_this_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_this_expression(@NotNull MParser.Java_this_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_this_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_this_expression(@NotNull MParser.Java_this_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_new_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_new_expression(@NotNull MParser.Java_new_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_new_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_new_expression(@NotNull MParser.Java_new_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link MParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaMethodExpression(@NotNull MParser.JavaMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link MParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaMethodExpression(@NotNull MParser.JavaMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link MParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaItemExpression(@NotNull MParser.JavaItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link MParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaItemExpression(@NotNull MParser.JavaItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_method_expression(@NotNull MParser.Java_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_method_expression(@NotNull MParser.Java_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link MParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentListItem(@NotNull MParser.JavaArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link MParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentListItem(@NotNull MParser.JavaArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link MParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentList(@NotNull MParser.JavaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link MParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentList(@NotNull MParser.JavaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_item_expression(@NotNull MParser.Java_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_item_expression(@NotNull MParser.Java_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_parenthesis_expression(@NotNull MParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_parenthesis_expression(@NotNull MParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link MParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifier(@NotNull MParser.JavaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link MParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifier(@NotNull MParser.JavaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link MParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildIdentifier(@NotNull MParser.JavaChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link MParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildIdentifier(@NotNull MParser.JavaChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link MParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaClassIdentifier(@NotNull MParser.JavaClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link MParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaClassIdentifier(@NotNull MParser.JavaClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link MParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildClassIdentifier(@NotNull MParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link MParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildClassIdentifier(@NotNull MParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIntegerLiteral(@NotNull MParser.JavaIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIntegerLiteral(@NotNull MParser.JavaIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaDecimalLiteral(@NotNull MParser.JavaDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaDecimalLiteral(@NotNull MParser.JavaDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaTextLiteral(@NotNull MParser.JavaTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaTextLiteral(@NotNull MParser.JavaTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaBooleanLiteral(@NotNull MParser.JavaBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaBooleanLiteral(@NotNull MParser.JavaBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCharacterLiteral(@NotNull MParser.JavaCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link MParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCharacterLiteral(@NotNull MParser.JavaCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJava_identifier(@NotNull MParser.Java_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJava_identifier(@NotNull MParser.Java_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link MParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpReturnStatement(@NotNull MParser.CSharpReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link MParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpReturnStatement(@NotNull MParser.CSharpReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link MParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpStatement(@NotNull MParser.CSharpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link MParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpStatement(@NotNull MParser.CSharpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link MParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpSelectorExpression(@NotNull MParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link MParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpSelectorExpression(@NotNull MParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link MParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPrimaryExpression(@NotNull MParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link MParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPrimaryExpression(@NotNull MParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_primary_expression(@NotNull MParser.Csharp_primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_primary_expression(@NotNull MParser.Csharp_primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_this_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_this_expression(@NotNull MParser.Csharp_this_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_this_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_this_expression(@NotNull MParser.Csharp_this_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_new_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_new_expression(@NotNull MParser.Csharp_new_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_new_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_new_expression(@NotNull MParser.Csharp_new_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link MParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpMethodExpression(@NotNull MParser.CSharpMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link MParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpMethodExpression(@NotNull MParser.CSharpMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link MParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpItemExpression(@NotNull MParser.CSharpItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link MParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpItemExpression(@NotNull MParser.CSharpItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_method_expression(@NotNull MParser.Csharp_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_method_expression(@NotNull MParser.Csharp_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link MParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentList(@NotNull MParser.CSharpArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link MParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentList(@NotNull MParser.CSharpArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link MParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentListItem(@NotNull MParser.CSharpArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link MParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentListItem(@NotNull MParser.CSharpArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_item_expression(@NotNull MParser.Csharp_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_item_expression(@NotNull MParser.Csharp_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_parenthesis_expression(@NotNull MParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_parenthesis_expression(@NotNull MParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifier(@NotNull MParser.CSharpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifier(@NotNull MParser.CSharpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpChildIdentifier(@NotNull MParser.CSharpChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpChildIdentifier(@NotNull MParser.CSharpChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPromptoIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPromptoIdentifier(@NotNull MParser.CSharpPromptoIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPromptoIdentifier}
	 * labeled alternative in {@link MParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPromptoIdentifier(@NotNull MParser.CSharpPromptoIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIntegerLiteral(@NotNull MParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIntegerLiteral(@NotNull MParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpDecimalLiteral(@NotNull MParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpDecimalLiteral(@NotNull MParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpTextLiteral(@NotNull MParser.CSharpTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpTextLiteral(@NotNull MParser.CSharpTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpBooleanLiteral(@NotNull MParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpBooleanLiteral(@NotNull MParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCharacterLiteral(@NotNull MParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link MParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCharacterLiteral(@NotNull MParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_identifier(@NotNull MParser.Csharp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_identifier(@NotNull MParser.Csharp_identifierContext ctx);
}