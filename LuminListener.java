// Generated from Lumin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuminParser}.
 */
public interface LuminListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuminParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuminParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuminParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuminParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuminParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LuminParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LuminParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LuminParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LuminParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LuminParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LuminParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(LuminParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(LuminParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(LuminParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(LuminParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(LuminParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(LuminParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(LuminParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(LuminParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuminParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LuminParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuminParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LuminParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(LuminParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(LuminParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(LuminParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(LuminParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprFalse(LuminParser.ExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprFalse(LuminParser.ExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(LuminParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(LuminParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprTrue(LuminParser.ExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprTrue(LuminParser.ExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(LuminParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(LuminParser.ExprRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenteses}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprParenteses(LuminParser.ExprParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenteses}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprParenteses(LuminParser.ExprParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprID(LuminParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprID(LuminParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSomaSub}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprSomaSub(LuminParser.ExprSomaSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSomaSub}
	 * labeled alternative in {@link LuminParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprSomaSub(LuminParser.ExprSomaSubContext ctx);
}