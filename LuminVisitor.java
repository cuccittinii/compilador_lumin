// Generated from Lumin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuminParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuminVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuminParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LuminParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(LuminParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(LuminParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LuminParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(LuminParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LuminParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(LuminParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(LuminParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EscritaID}
	 * labeled alternative in {@link LuminParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritaID(LuminParser.EscritaIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EscritaString}
	 * labeled alternative in {@link LuminParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritaString(LuminParser.EscritaStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuminParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LuminParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(LuminParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(LuminParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(LuminParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(LuminParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(LuminParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReal(LuminParser.ExprRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenteses}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenteses(LuminParser.ExprParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(LuminParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSomaSub}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSomaSub(LuminParser.ExprSomaSubContext ctx);
}