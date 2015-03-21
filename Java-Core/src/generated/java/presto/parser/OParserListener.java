// Generated from OParser.g4 by ANTLR 4.5
package presto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OParser}.
 */
public interface OParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_category_declaration(@NotNull OParser.Enum_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#enum_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_category_declaration(@NotNull OParser.Enum_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_native_declaration(@NotNull OParser.Enum_native_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#enum_native_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_native_declaration(@NotNull OParser.Enum_native_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCategory_symbol(@NotNull OParser.Category_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#category_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCategory_symbol(@NotNull OParser.Category_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNative_symbol(@NotNull OParser.Native_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#native_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNative_symbol(@NotNull OParser.Native_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull OParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull OParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_category_declaration(@NotNull OParser.Concrete_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#concrete_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_category_declaration(@NotNull OParser.Concrete_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_category_declaration(@NotNull OParser.Singleton_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#singleton_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_category_declaration(@NotNull OParser.Singleton_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerivedList}
	 * labeled alternative in {@link OParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerivedList(@NotNull OParser.DerivedListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerivedList}
	 * labeled alternative in {@link OParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerivedList(@NotNull OParser.DerivedListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerivedListItem}
	 * labeled alternative in {@link OParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void enterDerivedListItem(@NotNull OParser.DerivedListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerivedListItem}
	 * labeled alternative in {@link OParser#derived_list}.
	 * @param ctx the parse tree
	 */
	void exitDerivedListItem(@NotNull OParser.DerivedListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyCategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_list}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCategoryMethodList(@NotNull OParser.EmptyCategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyCategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_list}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCategoryMethodList(@NotNull OParser.EmptyCategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CurlyCategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_list}.
	 * @param ctx the parse tree
	 */
	void enterCurlyCategoryMethodList(@NotNull OParser.CurlyCategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CurlyCategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_list}.
	 * @param ctx the parse tree
	 */
	void exitCurlyCategoryMethodList(@NotNull OParser.CurlyCategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_method_declaration(@NotNull OParser.Member_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#member_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_method_declaration(@NotNull OParser.Member_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_method_declaration(@NotNull OParser.Operator_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#operator_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_method_declaration(@NotNull OParser.Operator_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetter_method_declaration(@NotNull OParser.Setter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#setter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetter_method_declaration(@NotNull OParser.Setter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetter_method_declaration(@NotNull OParser.Getter_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#getter_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetter_method_declaration(@NotNull OParser.Getter_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_resource_declaration(@NotNull OParser.Native_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#native_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_resource_declaration(@NotNull OParser.Native_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_declaration(@NotNull OParser.Native_category_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#native_category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_declaration(@NotNull OParser.Native_category_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void enterNative_category_mappings(@NotNull OParser.Native_category_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#native_category_mappings}.
	 * @param ctx the parse tree
	 */
	void exitNative_category_mappings(@NotNull OParser.Native_category_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link OParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingList(@NotNull OParser.NativeCategoryMappingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingList}
	 * labeled alternative in {@link OParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingList(@NotNull OParser.NativeCategoryMappingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link OParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryMappingListItem(@NotNull OParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryMappingListItem}
	 * labeled alternative in {@link OParser#native_category_mapping_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryMappingListItem(@NotNull OParser.NativeCategoryMappingListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeListItem}
	 * labeled alternative in {@link OParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttributeListItem(@NotNull OParser.AttributeListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeListItem}
	 * labeled alternative in {@link OParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttributeListItem(@NotNull OParser.AttributeListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeList}
	 * labeled alternative in {@link OParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(@NotNull OParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeList}
	 * labeled alternative in {@link OParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(@NotNull OParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_method_declaration(@NotNull OParser.Abstract_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#abstract_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_method_declaration(@NotNull OParser.Abstract_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_method_declaration(@NotNull OParser.Concrete_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#concrete_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_method_declaration(@NotNull OParser.Concrete_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNative_method_declaration(@NotNull OParser.Native_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#native_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNative_method_declaration(@NotNull OParser.Native_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void enterTyped_argument(@NotNull OParser.Typed_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#typed_argument}.
	 * @param ctx the parse tree
	 */
	void exitTyped_argument(@NotNull OParser.Typed_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleStatement}
	 * labeled alternative in {@link OParser#statement_or_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(@NotNull OParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleStatement}
	 * labeled alternative in {@link OParser#statement_or_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(@NotNull OParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CurlyStatementList}
	 * labeled alternative in {@link OParser#statement_or_list}.
	 * @param ctx the parse tree
	 */
	void enterCurlyStatementList(@NotNull OParser.CurlyStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CurlyStatementList}
	 * labeled alternative in {@link OParser#statement_or_list}.
	 * @param ctx the parse tree
	 */
	void exitCurlyStatementList(@NotNull OParser.CurlyStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull OParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull OParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInstanceStatement(@NotNull OParser.AssignInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignInstanceStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInstanceStatement(@NotNull OParser.AssignInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignTupleStatement(@NotNull OParser.AssignTupleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTupleStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignTupleStatement(@NotNull OParser.AssignTupleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull OParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull OParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull OParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull OParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull OParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull OParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull OParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull OParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull OParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull OParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull OParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull OParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull OParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull OParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(@NotNull OParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(@NotNull OParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull OParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull OParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithResourceStatement(@NotNull OParser.WithResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithResourceStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithResourceStatement(@NotNull OParser.WithResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithSingletonStatement(@NotNull OParser.WithSingletonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithSingletonStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithSingletonStatement(@NotNull OParser.WithSingletonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClosureStatement(@NotNull OParser.ClosureStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureStatement}
	 * labeled alternative in {@link OParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClosureStatement(@NotNull OParser.ClosureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_resource_statement(@NotNull OParser.With_resource_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#with_resource_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_resource_statement(@NotNull OParser.With_resource_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_singleton_statement(@NotNull OParser.With_singleton_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#with_singleton_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_singleton_statement(@NotNull OParser.With_singleton_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull OParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull OParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link OParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterAtomicSwitchCase(@NotNull OParser.AtomicSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicSwitchCase}
	 * labeled alternative in {@link OParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitAtomicSwitchCase(@NotNull OParser.AtomicSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link OParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSwitchCase(@NotNull OParser.CollectionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionSwitchCase}
	 * labeled alternative in {@link OParser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSwitchCase(@NotNull OParser.CollectionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_statement(@NotNull OParser.For_each_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#for_each_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_statement(@NotNull OParser.For_each_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull OParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull OParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull OParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull OParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull OParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull OParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link OParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementList(@NotNull OParser.ElseIfStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementList}
	 * labeled alternative in {@link OParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementList(@NotNull OParser.ElseIfStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link OParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatementListItem(@NotNull OParser.ElseIfStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatementListItem}
	 * labeled alternative in {@link OParser#else_if_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatementListItem(@NotNull OParser.ElseIfStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull OParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull OParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull OParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull OParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link OParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchAtomicStatement(@NotNull OParser.CatchAtomicStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchAtomicStatement}
	 * labeled alternative in {@link OParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchAtomicStatement(@NotNull OParser.CatchAtomicStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link OParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatchCollectionStatement(@NotNull OParser.CatchCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchCollectionStatement}
	 * labeled alternative in {@link OParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatchCollectionStatement(@NotNull OParser.CatchCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull OParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull OParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull OParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull OParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link OParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull OParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodName}
	 * labeled alternative in {@link OParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull OParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link OParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethodParent(@NotNull OParser.MethodParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodParent}
	 * labeled alternative in {@link OParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethodParent(@NotNull OParser.MethodParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link OParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableRoot(@NotNull OParser.CallableRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableRoot}
	 * labeled alternative in {@link OParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableRoot(@NotNull OParser.CallableRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link OParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void enterCallableSelector(@NotNull OParser.CallableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableSelector}
	 * labeled alternative in {@link OParser#callable_parent}.
	 * @param ctx the parse tree
	 */
	void exitCallableSelector(@NotNull OParser.CallableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link OParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableMemberSelector(@NotNull OParser.CallableMemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableMemberSelector}
	 * labeled alternative in {@link OParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableMemberSelector(@NotNull OParser.CallableMemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link OParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void enterCallableItemSelector(@NotNull OParser.CallableItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallableItemSelector}
	 * labeled alternative in {@link OParser#callable_selector}.
	 * @param ctx the parse tree
	 */
	void exitCallableItemSelector(@NotNull OParser.CallableItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull OParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosureExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull OParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull OParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull OParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAnyExpression(@NotNull OParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAnyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAnyExpression(@NotNull OParser.NotContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivideExpression(@NotNull OParser.IntDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDivideExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivideExpression(@NotNull OParser.IntDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(@NotNull OParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(@NotNull OParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull OParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull OParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoughlyEqualsExpression(@NotNull OParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoughlyEqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoughlyEqualsExpression(@NotNull OParser.RoughlyEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpression(@NotNull OParser.ContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpression(@NotNull OParser.ContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCodeExpression(@NotNull OParser.CodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCodeExpression(@NotNull OParser.CodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(@NotNull OParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(@NotNull OParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull OParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull OParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull OParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull OParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(@NotNull OParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(@NotNull OParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull OParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull OParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(@NotNull OParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(@NotNull OParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(@NotNull OParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(@NotNull OParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull OParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull OParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull OParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull OParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(@NotNull OParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(@NotNull OParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsAllExpression(@NotNull OParser.NotContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsAllExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsAllExpression(@NotNull OParser.NotContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(@NotNull OParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(@NotNull OParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull OParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull OParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull OParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull OParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(@NotNull OParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(@NotNull OParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAllExpression(@NotNull OParser.ContainsAllExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAllExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAllExpression(@NotNull OParser.ContainsAllExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExecuteExpression(@NotNull OParser.ExecuteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExecuteExpression(@NotNull OParser.ExecuteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotContainsExpression(@NotNull OParser.NotContainsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotContainsExpression(@NotNull OParser.NotContainsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(@NotNull OParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(@NotNull OParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(@NotNull OParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(@NotNull OParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContainsAnyExpression(@NotNull OParser.ContainsAnyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsAnyExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContainsAnyExpression(@NotNull OParser.ContainsAnyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull OParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull OParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull OParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull OParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(@NotNull OParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link OParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(@NotNull OParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull OParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull OParser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link OParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectableExpression(@NotNull OParser.SelectableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectableExpression}
	 * labeled alternative in {@link OParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectableExpression(@NotNull OParser.SelectableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link OParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull OParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorExpression}
	 * labeled alternative in {@link OParser#instance_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull OParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocumentExpression(@NotNull OParser.DocumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocumentExpression(@NotNull OParser.DocumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorExpression(@NotNull OParser.ConstructorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorExpression(@NotNull OParser.ConstructorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetchExpression(@NotNull OParser.FetchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetchExpression(@NotNull OParser.FetchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(@NotNull OParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(@NotNull OParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSortedExpression(@NotNull OParser.SortedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SortedExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSortedExpression(@NotNull OParser.SortedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull OParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link OParser#method_expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull OParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void enterDocument_expression(@NotNull OParser.Document_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#document_expression}.
	 * @param ctx the parse tree
	 */
	void exitDocument_expression(@NotNull OParser.Document_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(@NotNull OParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(@NotNull OParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull OParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull OParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void enterFetch_expression(@NotNull OParser.Fetch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#fetch_expression}.
	 * @param ctx the parse tree
	 */
	void exitFetch_expression(@NotNull OParser.Fetch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void enterSorted_expression(@NotNull OParser.Sorted_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#sorted_expression}.
	 * @param ctx the parse tree
	 */
	void exitSorted_expression(@NotNull OParser.Sorted_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelector(@NotNull OParser.MemberSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelector(@NotNull OParser.MemberSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterItemSelector(@NotNull OParser.ItemSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitItemSelector(@NotNull OParser.ItemSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSliceSelector(@NotNull OParser.SliceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceSelector}
	 * labeled alternative in {@link OParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSliceSelector(@NotNull OParser.SliceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(@NotNull OParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(@NotNull OParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentList(@NotNull OParser.ArgumentAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentList}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentList(@NotNull OParser.ArgumentAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignmentList(@NotNull OParser.ExpressionAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAssignmentList}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignmentList(@NotNull OParser.ExpressionAssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentAssignmentListItem(@NotNull OParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentAssignmentListItem}
	 * labeled alternative in {@link OParser#argument_assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentAssignmentListItem(@NotNull OParser.ArgumentAssignmentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArgument_assignment(@NotNull OParser.Argument_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#argument_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArgument_assignment(@NotNull OParser.Argument_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instance_statement(@NotNull OParser.Assign_instance_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#assign_instance_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instance_statement(@NotNull OParser.Assign_instance_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link OParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterMemberInstance(@NotNull OParser.MemberInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInstance}
	 * labeled alternative in {@link OParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitMemberInstance(@NotNull OParser.MemberInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link OParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void enterItemInstance(@NotNull OParser.ItemInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemInstance}
	 * labeled alternative in {@link OParser#child_instance}.
	 * @param ctx the parse tree
	 */
	void exitItemInstance(@NotNull OParser.ItemInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tuple_statement(@NotNull OParser.Assign_tuple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#assign_tuple_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tuple_statement(@NotNull OParser.Assign_tuple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(@NotNull OParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(@NotNull OParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link OParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFullDeclarationList(@NotNull OParser.FullDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullDeclarationList}
	 * labeled alternative in {@link OParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFullDeclarationList(@NotNull OParser.FullDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link OParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationListItem(@NotNull OParser.DeclarationListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationListItem}
	 * labeled alternative in {@link OParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationListItem(@NotNull OParser.DeclarationListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link OParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull OParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationList}
	 * labeled alternative in {@link OParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull OParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(@NotNull OParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(@NotNull OParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCategoryDeclaration(@NotNull OParser.CategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCategoryDeclaration(@NotNull OParser.CategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterResourceDeclaration(@NotNull OParser.ResourceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitResourceDeclaration(@NotNull OParser.ResourceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull OParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull OParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull OParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link OParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull OParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(@NotNull OParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(@NotNull OParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link OParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumCategoryDeclaration(@NotNull OParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumCategoryDeclaration}
	 * labeled alternative in {@link OParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumCategoryDeclaration(@NotNull OParser.EnumCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link OParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumNativeDeclaration(@NotNull OParser.EnumNativeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumNativeDeclaration}
	 * labeled alternative in {@link OParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumNativeDeclaration(@NotNull OParser.EnumNativeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link OParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolList(@NotNull OParser.NativeSymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolList}
	 * labeled alternative in {@link OParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolList(@NotNull OParser.NativeSymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link OParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeSymbolListItem(@NotNull OParser.NativeSymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeSymbolListItem}
	 * labeled alternative in {@link OParser#native_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeSymbolListItem(@NotNull OParser.NativeSymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link OParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolListItem(@NotNull OParser.CategorySymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolListItem}
	 * labeled alternative in {@link OParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolListItem(@NotNull OParser.CategorySymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link OParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterCategorySymbolList(@NotNull OParser.CategorySymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategorySymbolList}
	 * labeled alternative in {@link OParser#category_symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitCategorySymbolList(@NotNull OParser.CategorySymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link OParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolList(@NotNull OParser.SymbolListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolList}
	 * labeled alternative in {@link OParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolList(@NotNull OParser.SymbolListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link OParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbolListItem(@NotNull OParser.SymbolListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolListItem}
	 * labeled alternative in {@link OParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbolListItem(@NotNull OParser.SymbolListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingList(@NotNull OParser.MatchingListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingList}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingList(@NotNull OParser.MatchingListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingSet(@NotNull OParser.MatchingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingSet}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingSet(@NotNull OParser.MatchingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingRange(@NotNull OParser.MatchingRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingRange}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingRange(@NotNull OParser.MatchingRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingPattern(@NotNull OParser.MatchingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingPattern}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingPattern(@NotNull OParser.MatchingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMatchingExpression(@NotNull OParser.MatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchingExpression}
	 * labeled alternative in {@link OParser#attribute_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMatchingExpression(@NotNull OParser.MatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull OParser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull OParser.List_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(@NotNull OParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(@NotNull OParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link OParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueListItem(@NotNull OParser.ValueListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueListItem}
	 * labeled alternative in {@link OParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueListItem(@NotNull OParser.ValueListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link OParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull OParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link OParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull OParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void enterRange_literal(@NotNull OParser.Range_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#range_literal}.
	 * @param ctx the parse tree
	 */
	void exitRange_literal(@NotNull OParser.Range_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull OParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull OParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(@NotNull OParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(@NotNull OParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterDictType(@NotNull OParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitDictType(@NotNull OParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull OParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link OParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull OParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link OParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(@NotNull OParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeType}
	 * labeled alternative in {@link OParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(@NotNull OParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link OParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryType(@NotNull OParser.CategoryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryType}
	 * labeled alternative in {@link OParser#primary_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryType(@NotNull OParser.CategoryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull OParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull OParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull OParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull OParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(@NotNull OParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(@NotNull OParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull OParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull OParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(@NotNull OParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(@NotNull OParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull OParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull OParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(@NotNull OParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(@NotNull OParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(@NotNull OParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(@NotNull OParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterPeriodType(@NotNull OParser.PeriodTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitPeriodType(@NotNull OParser.PeriodTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void enterCodeType(@NotNull OParser.CodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeType}
	 * labeled alternative in {@link OParser#native_type}.
	 * @param ctx the parse tree
	 */
	void exitCodeType(@NotNull OParser.CodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#category_type}.
	 * @param ctx the parse tree
	 */
	void enterCategory_type(@NotNull OParser.Category_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#category_type}.
	 * @param ctx the parse tree
	 */
	void exitCategory_type(@NotNull OParser.Category_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#code_type}.
	 * @param ctx the parse tree
	 */
	void enterCode_type(@NotNull OParser.Code_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#code_type}.
	 * @param ctx the parse tree
	 */
	void exitCode_type(@NotNull OParser.Code_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#document_type}.
	 * @param ctx the parse tree
	 */
	void enterDocument_type(@NotNull OParser.Document_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#document_type}.
	 * @param ctx the parse tree
	 */
	void exitDocument_type(@NotNull OParser.Document_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteCategoryDeclaration(@NotNull OParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteCategoryDeclaration(@NotNull OParser.ConcreteCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeCategoryDeclaration(@NotNull OParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeCategoryDeclaration(@NotNull OParser.NativeCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingletonCategoryDeclaration(@NotNull OParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingletonCategoryDeclaration}
	 * labeled alternative in {@link OParser#category_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingletonCategoryDeclaration(@NotNull OParser.SingletonCategoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link OParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierListItem(@NotNull OParser.TypeIdentifierListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierListItem}
	 * labeled alternative in {@link OParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierListItem(@NotNull OParser.TypeIdentifierListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link OParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierList(@NotNull OParser.TypeIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifierList}
	 * labeled alternative in {@link OParser#type_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierList(@NotNull OParser.TypeIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link OParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodVariableIdentifier(@NotNull OParser.MethodVariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodVariableIdentifier}
	 * labeled alternative in {@link OParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodVariableIdentifier(@NotNull OParser.MethodVariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link OParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeIdentifier(@NotNull OParser.MethodTypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodTypeIdentifier}
	 * labeled alternative in {@link OParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeIdentifier(@NotNull OParser.MethodTypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull OParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull OParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull OParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull OParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbolIdentifier(@NotNull OParser.SymbolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolIdentifier}
	 * labeled alternative in {@link OParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbolIdentifier(@NotNull OParser.SymbolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull OParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull OParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull OParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull OParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_identifier(@NotNull OParser.Symbol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#symbol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_identifier(@NotNull OParser.Symbol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link OParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListItem(@NotNull OParser.ArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListItem}
	 * labeled alternative in {@link OParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListItem(@NotNull OParser.ArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link OParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull OParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link OParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull OParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link OParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterCodeArgument(@NotNull OParser.CodeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeArgument}
	 * labeled alternative in {@link OParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitCodeArgument(@NotNull OParser.CodeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link OParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArgument(@NotNull OParser.OperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorArgument}
	 * labeled alternative in {@link OParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArgument(@NotNull OParser.OperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link OParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(@NotNull OParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link OParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(@NotNull OParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link OParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgument(@NotNull OParser.TypedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedArgument}
	 * labeled alternative in {@link OParser#operator_argument}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgument(@NotNull OParser.TypedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(@NotNull OParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(@NotNull OParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void enterCode_argument(@NotNull OParser.Code_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#code_argument}.
	 * @param ctx the parse tree
	 */
	void exitCode_argument(@NotNull OParser.Code_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link OParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterCategoryArgumentType(@NotNull OParser.CategoryArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryArgumentType}
	 * labeled alternative in {@link OParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitCategoryArgumentType(@NotNull OParser.CategoryArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link OParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyArgumentType(@NotNull OParser.AnyArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyArgumentType}
	 * labeled alternative in {@link OParser#category_or_any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyArgumentType(@NotNull OParser.AnyArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(@NotNull OParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(@NotNull OParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyListType(@NotNull OParser.AnyListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyListType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyListType(@NotNull OParser.AnyListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAnyDictType(@NotNull OParser.AnyDictTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyDictType}
	 * labeled alternative in {@link OParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAnyDictType(@NotNull OParser.AnyDictTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link OParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodListItem(@NotNull OParser.CategoryMethodListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodListItem}
	 * labeled alternative in {@link OParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodListItem(@NotNull OParser.CategoryMethodListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterCategoryMethodList(@NotNull OParser.CategoryMethodListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CategoryMethodList}
	 * labeled alternative in {@link OParser#category_method_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitCategoryMethodList(@NotNull OParser.CategoryMethodListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetterMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSetterMethod(@NotNull OParser.SetterMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetterMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSetterMethod(@NotNull OParser.SetterMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterMethod(@NotNull OParser.GetterMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterMethod(@NotNull OParser.GetterMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberMethod(@NotNull OParser.MemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberMethod(@NotNull OParser.MemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMethod(@NotNull OParser.OperatorMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMethod}
	 * labeled alternative in {@link OParser#category_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMethod(@NotNull OParser.OperatorMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaCategoryMapping(@NotNull OParser.JavaCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaCategoryMapping(@NotNull OParser.JavaCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCategoryMapping(@NotNull OParser.CSharpCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCategoryMapping(@NotNull OParser.CSharpCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython2CategoryMapping(@NotNull OParser.Python2CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2CategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython2CategoryMapping(@NotNull OParser.Python2CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython3CategoryMapping(@NotNull OParser.Python3CategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3CategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython3CategoryMapping(@NotNull OParser.Python3CategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptCategoryMapping(@NotNull OParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptCategoryMapping}
	 * labeled alternative in {@link OParser#native_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptCategoryMapping(@NotNull OParser.JavaScriptCategoryMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterPython_category_mapping(@NotNull OParser.Python_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitPython_category_mapping(@NotNull OParser.Python_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_module}.
	 * @param ctx the parse tree
	 */
	void enterPython_module(@NotNull OParser.Python_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_module}.
	 * @param ctx the parse tree
	 */
	void exitPython_module(@NotNull OParser.Python_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#module_token}.
	 * @param ctx the parse tree
	 */
	void enterModule_token(@NotNull OParser.Module_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#module_token}.
	 * @param ctx the parse tree
	 */
	void exitModule_token(@NotNull OParser.Module_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_category_mapping(@NotNull OParser.Javascript_category_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_category_mapping}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_category_mapping(@NotNull OParser.Javascript_category_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_module(@NotNull OParser.Javascript_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_module}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_module(@NotNull OParser.Javascript_moduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link OParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(@NotNull OParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableList}
	 * labeled alternative in {@link OParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(@NotNull OParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link OParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariableListItem(@NotNull OParser.VariableListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableListItem}
	 * labeled alternative in {@link OParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariableListItem(@NotNull OParser.VariableListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethod(@NotNull OParser.AbstractMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethod(@NotNull OParser.AbstractMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConcreteMethod(@NotNull OParser.ConcreteMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConcreteMethod(@NotNull OParser.ConcreteMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNativeMethod(@NotNull OParser.NativeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeMethod}
	 * labeled alternative in {@link OParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNativeMethod(@NotNull OParser.NativeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link OParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementList(@NotNull OParser.NativeStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementList}
	 * labeled alternative in {@link OParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementList(@NotNull OParser.NativeStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link OParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterNativeStatementListItem(@NotNull OParser.NativeStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NativeStatementListItem}
	 * labeled alternative in {@link OParser#native_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitNativeStatementListItem(@NotNull OParser.NativeStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaNativeStatement(@NotNull OParser.JavaNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaNativeStatement(@NotNull OParser.JavaNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpNativeStatement(@NotNull OParser.CSharpNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpNativeStatement(@NotNull OParser.CSharpNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython2NativeStatement(@NotNull OParser.Python2NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python2NativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython2NativeStatement(@NotNull OParser.Python2NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython3NativeStatement(@NotNull OParser.Python3NativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Python3NativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython3NativeStatement(@NotNull OParser.Python3NativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaScriptNativeStatement(@NotNull OParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaScriptNativeStatement}
	 * labeled alternative in {@link OParser#native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaScriptNativeStatement(@NotNull OParser.JavaScriptNativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterPython_native_statement(@NotNull OParser.Python_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitPython_native_statement(@NotNull OParser.Python_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_native_statement(@NotNull OParser.Javascript_native_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_native_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_native_statement(@NotNull OParser.Javascript_native_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link OParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementListItem(@NotNull OParser.StatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementListItem}
	 * labeled alternative in {@link OParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementListItem(@NotNull OParser.StatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link OParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull OParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link OParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull OParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link OParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementListItem(@NotNull OParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementListItem}
	 * labeled alternative in {@link OParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementListItem(@NotNull OParser.SwitchCaseStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link OParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatementList(@NotNull OParser.SwitchCaseStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseStatementList}
	 * labeled alternative in {@link OParser#switch_case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatementList(@NotNull OParser.SwitchCaseStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link OParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementListItem(@NotNull OParser.CatchStatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementListItem}
	 * labeled alternative in {@link OParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementListItem(@NotNull OParser.CatchStatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link OParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatementList(@NotNull OParser.CatchStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchStatementList}
	 * labeled alternative in {@link OParser#catch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatementList(@NotNull OParser.CatchStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRangeLiteral(@NotNull OParser.LiteralRangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRangeLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRangeLiteral(@NotNull OParser.LiteralRangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListLiteral(@NotNull OParser.LiteralListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListLiteral(@NotNull OParser.LiteralListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSetLiteral(@NotNull OParser.LiteralSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralSetLiteral}
	 * labeled alternative in {@link OParser#literal_collection}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSetLiteral(@NotNull OParser.LiteralSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMinIntegerLiteral(@NotNull OParser.MinIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinIntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMinIntegerLiteral(@NotNull OParser.MinIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterMaxIntegerLiteral(@NotNull OParser.MaxIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxIntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitMaxIntegerLiteral(@NotNull OParser.MaxIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull OParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull OParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull OParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull OParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(@NotNull OParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(@NotNull OParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(@NotNull OParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(@NotNull OParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(@NotNull OParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(@NotNull OParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(@NotNull OParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(@NotNull OParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull OParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull OParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(@NotNull OParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(@NotNull OParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull OParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull OParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterPeriodLiteral(@NotNull OParser.PeriodLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeriodLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitPeriodLiteral(@NotNull OParser.PeriodLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull OParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link OParser#atomic_literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull OParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link OParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(@NotNull OParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link OParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(@NotNull OParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link OParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralListItem(@NotNull OParser.LiteralListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralListItem}
	 * labeled alternative in {@link OParser#literal_list_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralListItem(@NotNull OParser.LiteralListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull OParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull OParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull OParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull OParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull OParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull OParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull OParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link OParser#selectable_expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull OParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expression(@NotNull OParser.This_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#this_expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expression(@NotNull OParser.This_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(@NotNull OParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(@NotNull OParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link OParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLiteral(@NotNull OParser.AtomicLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicLiteral}
	 * labeled alternative in {@link OParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLiteral(@NotNull OParser.AtomicLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link OParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull OParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CollectionLiteral}
	 * labeled alternative in {@link OParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull OParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(@NotNull OParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(@NotNull OParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(@NotNull OParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(@NotNull OParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(@NotNull OParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(@NotNull OParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(@NotNull OParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(@NotNull OParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteral(@NotNull OParser.TupleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleLiteral}
	 * labeled alternative in {@link OParser#collection_literal}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteral(@NotNull OParser.TupleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(@NotNull OParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(@NotNull OParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDict_literal(@NotNull OParser.Dict_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDict_literal(@NotNull OParser.Dict_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link OParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTupleItem(@NotNull OParser.ValueTupleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTupleItem}
	 * labeled alternative in {@link OParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTupleItem(@NotNull OParser.ValueTupleItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link OParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(@NotNull OParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTuple}
	 * labeled alternative in {@link OParser#expression_tuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(@NotNull OParser.ValueTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link OParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryList(@NotNull OParser.DictEntryListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryList}
	 * labeled alternative in {@link OParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryList(@NotNull OParser.DictEntryListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link OParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryListItem(@NotNull OParser.DictEntryListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntryListItem}
	 * labeled alternative in {@link OParser#dict_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryListItem(@NotNull OParser.DictEntryListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(@NotNull OParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(@NotNull OParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstAndLast(@NotNull OParser.SliceFirstAndLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstAndLast}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstAndLast(@NotNull OParser.SliceFirstAndLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceFirstOnly(@NotNull OParser.SliceFirstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceFirstOnly}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceFirstOnly(@NotNull OParser.SliceFirstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSliceLastOnly(@NotNull OParser.SliceLastOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceLastOnly}
	 * labeled alternative in {@link OParser#slice_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSliceLastOnly(@NotNull OParser.SliceLastOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_statement(@NotNull OParser.Assign_variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#assign_variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_statement(@NotNull OParser.Assign_variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link OParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterRootInstance(@NotNull OParser.RootInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootInstance}
	 * labeled alternative in {@link OParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitRootInstance(@NotNull OParser.RootInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link OParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void enterChildInstance(@NotNull OParser.ChildInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildInstance}
	 * labeled alternative in {@link OParser#assignable_instance}.
	 * @param ctx the parse tree
	 */
	void exitChildInstance(@NotNull OParser.ChildInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link OParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsATypeExpression(@NotNull OParser.IsATypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsATypeExpression}
	 * labeled alternative in {@link OParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsATypeExpression(@NotNull OParser.IsATypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link OParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsOtherExpression(@NotNull OParser.IsOtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOtherExpression}
	 * labeled alternative in {@link OParser#is_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsOtherExpression(@NotNull OParser.IsOtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPlus(@NotNull OParser.OperatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorPlus}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPlus(@NotNull OParser.OperatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMinus(@NotNull OParser.OperatorMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMinus}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMinus(@NotNull OParser.OperatorMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMultiply(@NotNull OParser.OperatorMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorMultiply}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMultiply(@NotNull OParser.OperatorMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDivide(@NotNull OParser.OperatorDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorDivide}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDivide(@NotNull OParser.OperatorDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIDivide(@NotNull OParser.OperatorIDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorIDivide}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIDivide(@NotNull OParser.OperatorIDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorModulo(@NotNull OParser.OperatorModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorModulo}
	 * labeled alternative in {@link OParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorModulo(@NotNull OParser.OperatorModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#key_token}.
	 * @param ctx the parse tree
	 */
	void enterKey_token(@NotNull OParser.Key_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#key_token}.
	 * @param ctx the parse tree
	 */
	void exitKey_token(@NotNull OParser.Key_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#value_token}.
	 * @param ctx the parse tree
	 */
	void enterValue_token(@NotNull OParser.Value_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#value_token}.
	 * @param ctx the parse tree
	 */
	void exitValue_token(@NotNull OParser.Value_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_token(@NotNull OParser.Symbols_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#symbols_token}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_token(@NotNull OParser.Symbols_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull OParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull OParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull OParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull OParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull OParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull OParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#idivide}.
	 * @param ctx the parse tree
	 */
	void enterIdivide(@NotNull OParser.IdivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#idivide}.
	 * @param ctx the parse tree
	 */
	void exitIdivide(@NotNull OParser.IdivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull OParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull OParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#lfs}.
	 * @param ctx the parse tree
	 */
	void enterLfs(@NotNull OParser.LfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#lfs}.
	 * @param ctx the parse tree
	 */
	void exitLfs(@NotNull OParser.LfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#lfp}.
	 * @param ctx the parse tree
	 */
	void enterLfp(@NotNull OParser.LfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#lfp}.
	 * @param ctx the parse tree
	 */
	void exitLfp(@NotNull OParser.LfpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link OParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptReturnStatement(@NotNull OParser.JavascriptReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptReturnStatement}
	 * labeled alternative in {@link OParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptReturnStatement(@NotNull OParser.JavascriptReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link OParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptStatement(@NotNull OParser.JavascriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptStatement}
	 * labeled alternative in {@link OParser#javascript_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptStatement(@NotNull OParser.JavascriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link OParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptPrimaryExpression(@NotNull OParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptPrimaryExpression}
	 * labeled alternative in {@link OParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptPrimaryExpression(@NotNull OParser.JavascriptPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link OParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptSelectorExpression(@NotNull OParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptSelectorExpression}
	 * labeled alternative in {@link OParser#javascript_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptSelectorExpression(@NotNull OParser.JavascriptSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptParenthesisExpression(@NotNull OParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptParenthesisExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptParenthesisExpression(@NotNull OParser.JavascriptParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifierExpression(@NotNull OParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifierExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifierExpression(@NotNull OParser.JavascriptIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptLiteralExpression(@NotNull OParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptLiteralExpression}
	 * labeled alternative in {@link OParser#javascript_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptLiteralExpression(@NotNull OParser.JavascriptLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link OParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptMethodExpression(@NotNull OParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptMethodExpression}
	 * labeled alternative in {@link OParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptMethodExpression(@NotNull OParser.JavascriptMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link OParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptItemExpression(@NotNull OParser.JavascriptItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptItemExpression}
	 * labeled alternative in {@link OParser#javascript_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptItemExpression(@NotNull OParser.JavascriptItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_method_expression(@NotNull OParser.Javascript_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_method_expression(@NotNull OParser.Javascript_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link OParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentListItem(@NotNull OParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentListItem}
	 * labeled alternative in {@link OParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentListItem(@NotNull OParser.JavascriptArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link OParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptArgumentList(@NotNull OParser.JavascriptArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptArgumentList}
	 * labeled alternative in {@link OParser#javascript_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptArgumentList(@NotNull OParser.JavascriptArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_item_expression(@NotNull OParser.Javascript_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_item_expression(@NotNull OParser.Javascript_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_parenthesis_expression(@NotNull OParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_parenthesis_expression(@NotNull OParser.Javascript_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link OParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptChildIdentifier(@NotNull OParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptChildIdentifier}
	 * labeled alternative in {@link OParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptChildIdentifier(@NotNull OParser.JavascriptChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link OParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIdentifier(@NotNull OParser.JavascriptIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIdentifier}
	 * labeled alternative in {@link OParser#javascript_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIdentifier(@NotNull OParser.JavascriptIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptIntegerLiteral(@NotNull OParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptIntegerLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptIntegerLiteral(@NotNull OParser.JavascriptIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptDecimalLiteral(@NotNull OParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptDecimalLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptDecimalLiteral(@NotNull OParser.JavascriptDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptTextLiteral(@NotNull OParser.JavascriptTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptTextLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptTextLiteral(@NotNull OParser.JavascriptTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptBooleanLiteral(@NotNull OParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptBooleanLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptBooleanLiteral(@NotNull OParser.JavascriptBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptCharacterLiteral(@NotNull OParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavascriptCharacterLiteral}
	 * labeled alternative in {@link OParser#javascript_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptCharacterLiteral(@NotNull OParser.JavascriptCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJavascript_identifier(@NotNull OParser.Javascript_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#javascript_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJavascript_identifier(@NotNull OParser.Javascript_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link OParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturnStatement(@NotNull OParser.PythonReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturnStatement}
	 * labeled alternative in {@link OParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturnStatement(@NotNull OParser.PythonReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link OParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(@NotNull OParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link OParser#python_statement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(@NotNull OParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link OParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonPrimaryExpression(@NotNull OParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonPrimaryExpression}
	 * labeled alternative in {@link OParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonPrimaryExpression(@NotNull OParser.PythonPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link OParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonSelectorExpression(@NotNull OParser.PythonSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonSelectorExpression}
	 * labeled alternative in {@link OParser#python_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonSelectorExpression(@NotNull OParser.PythonSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonParenthesisExpression(@NotNull OParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonParenthesisExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonParenthesisExpression(@NotNull OParser.PythonParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifierExpression(@NotNull OParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifierExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifierExpression(@NotNull OParser.PythonIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonLiteralExpression(@NotNull OParser.PythonLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonLiteralExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonLiteralExpression(@NotNull OParser.PythonLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonGlobalMethodExpression(@NotNull OParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonGlobalMethodExpression}
	 * labeled alternative in {@link OParser#python_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonGlobalMethodExpression(@NotNull OParser.PythonGlobalMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link OParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonMethodExpression(@NotNull OParser.PythonMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonMethodExpression}
	 * labeled alternative in {@link OParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonMethodExpression(@NotNull OParser.PythonMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link OParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonItemExpression(@NotNull OParser.PythonItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonItemExpression}
	 * labeled alternative in {@link OParser#python_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonItemExpression(@NotNull OParser.PythonItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_method_expression(@NotNull OParser.Python_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_method_expression(@NotNull OParser.Python_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalOnlyArgumentList(@NotNull OParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalOnlyArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalOnlyArgumentList(@NotNull OParser.PythonOrdinalOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedOnlyArgumentList(@NotNull OParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedOnlyArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedOnlyArgumentList(@NotNull OParser.PythonNamedOnlyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgumentList(@NotNull OParser.PythonArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonArgumentList}
	 * labeled alternative in {@link OParser#python_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgumentList(@NotNull OParser.PythonArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link OParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentListItem(@NotNull OParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentListItem}
	 * labeled alternative in {@link OParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentListItem(@NotNull OParser.PythonOrdinalArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link OParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonOrdinalArgumentList(@NotNull OParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonOrdinalArgumentList}
	 * labeled alternative in {@link OParser#python_ordinal_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonOrdinalArgumentList(@NotNull OParser.PythonOrdinalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link OParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentListItem(@NotNull OParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentListItem}
	 * labeled alternative in {@link OParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentListItem(@NotNull OParser.PythonNamedArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link OParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPythonNamedArgumentList(@NotNull OParser.PythonNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNamedArgumentList}
	 * labeled alternative in {@link OParser#python_named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPythonNamedArgumentList(@NotNull OParser.PythonNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterPython_parenthesis_expression(@NotNull OParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitPython_parenthesis_expression(@NotNull OParser.Python_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link OParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonChildIdentifier(@NotNull OParser.PythonChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonChildIdentifier}
	 * labeled alternative in {@link OParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonChildIdentifier(@NotNull OParser.PythonChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link OParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIdentifier(@NotNull OParser.PythonIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIdentifier}
	 * labeled alternative in {@link OParser#python_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIdentifier(@NotNull OParser.PythonIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonIntegerLiteral(@NotNull OParser.PythonIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIntegerLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonIntegerLiteral(@NotNull OParser.PythonIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecimalLiteral(@NotNull OParser.PythonDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecimalLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecimalLiteral(@NotNull OParser.PythonDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonTextLiteral(@NotNull OParser.PythonTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonTextLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonTextLiteral(@NotNull OParser.PythonTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonBooleanLiteral(@NotNull OParser.PythonBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonBooleanLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonBooleanLiteral(@NotNull OParser.PythonBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterPythonCharacterLiteral(@NotNull OParser.PythonCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonCharacterLiteral}
	 * labeled alternative in {@link OParser#python_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitPythonCharacterLiteral(@NotNull OParser.PythonCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPython_identifier(@NotNull OParser.Python_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#python_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPython_identifier(@NotNull OParser.Python_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link OParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaReturnStatement(@NotNull OParser.JavaReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaReturnStatement}
	 * labeled alternative in {@link OParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaReturnStatement(@NotNull OParser.JavaReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link OParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void enterJavaStatement(@NotNull OParser.JavaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaStatement}
	 * labeled alternative in {@link OParser#java_statement}.
	 * @param ctx the parse tree
	 */
	void exitJavaStatement(@NotNull OParser.JavaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link OParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaPrimaryExpression(@NotNull OParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaPrimaryExpression}
	 * labeled alternative in {@link OParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaPrimaryExpression(@NotNull OParser.JavaPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link OParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaSelectorExpression(@NotNull OParser.JavaSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaSelectorExpression}
	 * labeled alternative in {@link OParser#java_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaSelectorExpression(@NotNull OParser.JavaSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaParenthesisExpression(@NotNull OParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaParenthesisExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaParenthesisExpression(@NotNull OParser.JavaParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifierExpression(@NotNull OParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifierExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifierExpression(@NotNull OParser.JavaIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaLiteralExpression(@NotNull OParser.JavaLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaLiteralExpression}
	 * labeled alternative in {@link OParser#java_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaLiteralExpression(@NotNull OParser.JavaLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link OParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaMethodExpression(@NotNull OParser.JavaMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaMethodExpression}
	 * labeled alternative in {@link OParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaMethodExpression(@NotNull OParser.JavaMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link OParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaItemExpression(@NotNull OParser.JavaItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaItemExpression}
	 * labeled alternative in {@link OParser#java_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaItemExpression(@NotNull OParser.JavaItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_method_expression(@NotNull OParser.Java_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#java_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_method_expression(@NotNull OParser.Java_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link OParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentList(@NotNull OParser.JavaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentList}
	 * labeled alternative in {@link OParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentList(@NotNull OParser.JavaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link OParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void enterJavaArgumentListItem(@NotNull OParser.JavaArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaArgumentListItem}
	 * labeled alternative in {@link OParser#java_arguments}.
	 * @param ctx the parse tree
	 */
	void exitJavaArgumentListItem(@NotNull OParser.JavaArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_item_expression(@NotNull OParser.Java_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#java_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_item_expression(@NotNull OParser.Java_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterJava_parenthesis_expression(@NotNull OParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#java_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitJava_parenthesis_expression(@NotNull OParser.Java_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link OParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIdentifier(@NotNull OParser.JavaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIdentifier}
	 * labeled alternative in {@link OParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIdentifier(@NotNull OParser.JavaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link OParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildIdentifier(@NotNull OParser.JavaChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildIdentifier}
	 * labeled alternative in {@link OParser#java_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildIdentifier(@NotNull OParser.JavaChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link OParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaChildClassIdentifier(@NotNull OParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaChildClassIdentifier}
	 * labeled alternative in {@link OParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaChildClassIdentifier(@NotNull OParser.JavaChildClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link OParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaClassIdentifier(@NotNull OParser.JavaClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaClassIdentifier}
	 * labeled alternative in {@link OParser#java_class_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaClassIdentifier(@NotNull OParser.JavaClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaIntegerLiteral(@NotNull OParser.JavaIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaIntegerLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaIntegerLiteral(@NotNull OParser.JavaIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaDecimalLiteral(@NotNull OParser.JavaDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaDecimalLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaDecimalLiteral(@NotNull OParser.JavaDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaTextLiteral(@NotNull OParser.JavaTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaTextLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaTextLiteral(@NotNull OParser.JavaTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaBooleanLiteral(@NotNull OParser.JavaBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaBooleanLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaBooleanLiteral(@NotNull OParser.JavaBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCharacterLiteral(@NotNull OParser.JavaCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JavaCharacterLiteral}
	 * labeled alternative in {@link OParser#java_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCharacterLiteral(@NotNull OParser.JavaCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void enterJava_identifier(@NotNull OParser.Java_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#java_identifier}.
	 * @param ctx the parse tree
	 */
	void exitJava_identifier(@NotNull OParser.Java_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link OParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpReturnStatement(@NotNull OParser.CSharpReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpReturnStatement}
	 * labeled alternative in {@link OParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpReturnStatement(@NotNull OParser.CSharpReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link OParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void enterCSharpStatement(@NotNull OParser.CSharpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpStatement}
	 * labeled alternative in {@link OParser#csharp_statement}.
	 * @param ctx the parse tree
	 */
	void exitCSharpStatement(@NotNull OParser.CSharpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link OParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpPrimaryExpression(@NotNull OParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpPrimaryExpression}
	 * labeled alternative in {@link OParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpPrimaryExpression(@NotNull OParser.CSharpPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link OParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpSelectorExpression(@NotNull OParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpSelectorExpression}
	 * labeled alternative in {@link OParser#csharp_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpSelectorExpression(@NotNull OParser.CSharpSelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpParenthesisExpression(@NotNull OParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpParenthesisExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpParenthesisExpression(@NotNull OParser.CSharpParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifierExpression(@NotNull OParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifierExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifierExpression(@NotNull OParser.CSharpIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpLiteralExpression(@NotNull OParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpLiteralExpression}
	 * labeled alternative in {@link OParser#csharp_primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpLiteralExpression(@NotNull OParser.CSharpLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link OParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpMethodExpression(@NotNull OParser.CSharpMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpMethodExpression}
	 * labeled alternative in {@link OParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpMethodExpression(@NotNull OParser.CSharpMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link OParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpItemExpression(@NotNull OParser.CSharpItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpItemExpression}
	 * labeled alternative in {@link OParser#csharp_selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpItemExpression(@NotNull OParser.CSharpItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_method_expression(@NotNull OParser.Csharp_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#csharp_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_method_expression(@NotNull OParser.Csharp_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link OParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentList(@NotNull OParser.CSharpArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentList}
	 * labeled alternative in {@link OParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentList(@NotNull OParser.CSharpArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link OParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCSharpArgumentListItem(@NotNull OParser.CSharpArgumentListItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpArgumentListItem}
	 * labeled alternative in {@link OParser#csharp_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCSharpArgumentListItem(@NotNull OParser.CSharpArgumentListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_item_expression(@NotNull OParser.Csharp_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#csharp_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_item_expression(@NotNull OParser.Csharp_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_parenthesis_expression(@NotNull OParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#csharp_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_parenthesis_expression(@NotNull OParser.Csharp_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link OParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIdentifier(@NotNull OParser.CSharpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIdentifier}
	 * labeled alternative in {@link OParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIdentifier(@NotNull OParser.CSharpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link OParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpChildIdentifier(@NotNull OParser.CSharpChildIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpChildIdentifier}
	 * labeled alternative in {@link OParser#csharp_identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpChildIdentifier(@NotNull OParser.CSharpChildIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpIntegerLiteral(@NotNull OParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpIntegerLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpIntegerLiteral(@NotNull OParser.CSharpIntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpDecimalLiteral(@NotNull OParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpDecimalLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpDecimalLiteral(@NotNull OParser.CSharpDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpTextLiteral(@NotNull OParser.CSharpTextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpTextLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpTextLiteral(@NotNull OParser.CSharpTextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpBooleanLiteral(@NotNull OParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpBooleanLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpBooleanLiteral(@NotNull OParser.CSharpBooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSharpCharacterLiteral(@NotNull OParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSharpCharacterLiteral}
	 * labeled alternative in {@link OParser#csharp_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSharpCharacterLiteral(@NotNull OParser.CSharpCharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCsharp_identifier(@NotNull OParser.Csharp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OParser#csharp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCsharp_identifier(@NotNull OParser.Csharp_identifierContext ctx);
}