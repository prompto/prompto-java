// Generated from ArgsParser.g4 by ANTLR 4.5
package prompto.utils;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArgsParser}.
 */
public interface ArgsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArgsParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ArgsParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgsParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ArgsParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgsParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull ArgsParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgsParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull ArgsParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgsParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(@NotNull ArgsParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgsParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(@NotNull ArgsParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ELEMENT}
	 * labeled alternative in {@link ArgsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterELEMENT(@NotNull ArgsParser.ELEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ELEMENT}
	 * labeled alternative in {@link ArgsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitELEMENT(@NotNull ArgsParser.ELEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link ArgsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(@NotNull ArgsParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link ArgsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(@NotNull ArgsParser.STRINGContext ctx);
}