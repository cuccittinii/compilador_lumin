import java.util.*;

public class LuminSemantico extends LuminBaseListener {

    private final Map<String, String> tabelaSimbolos = new HashMap<>();
    private final List<String> erros = new ArrayList<>();

    public List<String> getErros() {
        return erros;
    }

    @Override
    public void enterDeclaracao(LuminParser.DeclaracaoContext ctx) {
        if (ctx.ID() == null || ctx.tipo() == null) {
            erros.add("Erro de sintaxe na declaração.");
            return;
        }

        String nome = ctx.ID().getText();
        String tipo = ctx.tipo().getText();

        if (tabelaSimbolos.containsKey(nome)) {
            erros.add("Erro: variável '" + nome + "' já declarada.");
        } else {
            tabelaSimbolos.put(nome, tipo);
        }
    }

    @Override
    public void enterAtribuicao(LuminParser.AtribuicaoContext ctx) {
        String nome = ctx.ID().getText();

        if (!tabelaSimbolos.containsKey(nome)) {
            erros.add("Erro: variável '" + nome + "' não declarada.");
            return;
        }

        String tipoVar = tabelaSimbolos.get(nome);
        String tipoExpr = verificarTipo(ctx.expressao());

        if (tipoExpr.equals("erro")) {
            erros.add("Erro: expressão inválida na atribuição à variável '" + nome + "'.");
        } else if (tipoExpr.equals("desconhecido")) {
            erros.add("Erro: tipo da expressão desconhecido na atribuição à variável '" + nome + "'.");
        } else if (!tipoVar.equals(tipoExpr)) {
            erros.add("Erro: tipo incompatível na atribuição à variável '" + nome +
                    "'. Esperado '" + tipoVar + "', mas encontrado '" + tipoExpr + "'.");
        }
    }

    private String verificarTipo(LuminParser.ExpressaoContext ctx) {
        if (ctx instanceof LuminParser.ExprIntContext) {
            return "clarus";
        }
        if (ctx instanceof LuminParser.ExprRealContext) {
            return "flux";
        }
        if (ctx instanceof LuminParser.ExprTrueContext || ctx instanceof LuminParser.ExprFalseContext) {
            return "veritas";
        }
        if (ctx instanceof LuminParser.ExprIDContext) {
            String nome = ctx.getText();
            return tabelaSimbolos.getOrDefault(nome, "desconhecido");
        }
        if (ctx instanceof LuminParser.ExprSomaSubContext) {
            LuminParser.ExprSomaSubContext e = (LuminParser.ExprSomaSubContext) ctx;
            String t1 = verificarTipo(e.expressao(0));
            String t2 = verificarTipo(e.expressao(1));
            if (t1.equals("veritas") || t2.equals("veritas")) return "erro";
            if (t1.equals("flux") || t2.equals("flux")) return "flux";
            if (t1.equals("clarus") && t2.equals("clarus")) return "clarus";
            return "erro";
        }
        if (ctx instanceof LuminParser.ExprMulDivContext) {
            LuminParser.ExprMulDivContext e = (LuminParser.ExprMulDivContext) ctx;
            String t1 = verificarTipo(e.expressao(0));
            String t2 = verificarTipo(e.expressao(1));
            if (t1.equals("veritas") || t2.equals("veritas")) return "erro";
            if (t1.equals("flux") || t2.equals("flux")) return "flux";
            if (t1.equals("clarus") && t2.equals("clarus")) return "clarus";
            return "erro";
        }
        if (ctx instanceof LuminParser.ExprRelacionalContext) {
            return "veritas";
        }
        if (ctx instanceof LuminParser.ExprParentesesContext) {
            return verificarTipo(((LuminParser.ExprParentesesContext) ctx).expressao());
        }
        return "desconhecido";
    }
}
