import java.util.List;
import java.util.ArrayList;

public class LuminGeradorDeCodigo extends LuminBaseVisitor<String> {

    private List<String> declaracoes = new ArrayList<>();



    @Override
public String visitPrograma(LuminParser.ProgramaContext ctx) {
    declaracoes.clear();
    StringBuilder builder = new StringBuilder();

    for (LuminParser.ComandoContext comando : ctx.comando()) {
        String linha = visit(comando);
        if (linha != null && !linha.isBlank()) {
            builder.append(linha).append("\n");
        }
    }

    System.out.println("DECLARAÇÕES GERADAS:");
    for (String decl : declaracoes) {
        System.out.println(decl);
    }

    return """
        import java.util.Scanner;
        public class Saida {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                %s
                %s
            }
        }
        """.formatted(
        String.join("\n", declaracoes),
        builder.toString()
    );
}



   @Override
public String visitDeclaracao(LuminParser.DeclaracaoContext ctx) {
    String tipo = ctx.tipo().getText();
    String id = ctx.ID().getText();

    String tipoJava = switch (tipo) {
        case "clarus" -> "int";
        case "flux" -> "double";
        case "veritas" -> "boolean";
        default -> "Object";
    };

    String declaracao = tipoJava + " " + id + ";";
    System.out.println(">> ADICIONANDO DECLARAÇÃO: " + declaracao);  // ADICIONE ISSO AQUI

    declaracoes.add(declaracao);
    return "";
}



    @Override
    public String visitAtribuicao(LuminParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        String expressao = visit(ctx.expressao());

        return id + " = " + expressao + ";";
    }

    @Override
    public String visitCondicional(LuminParser.CondicionalContext ctx) {
        String condicao = visit(ctx.expressao());
        String blocoIf = visit(ctx.bloco(0));
        String blocoElse = "";

        if (ctx.SENAO() != null && ctx.bloco().size() > 1) {
            blocoElse = visit(ctx.bloco(1));
        }

        String resultado = "if (" + condicao + ") {\n" + blocoIf + "\n}";
        if (!blocoElse.isBlank()) {
            resultado += " else {\n" + blocoElse + "\n}";
        }
        return resultado;
    }

    @Override
    public String visitRepeticao(LuminParser.RepeticaoContext ctx) {
        String condicao = visit(ctx.expressao());
        String bloco = visit(ctx.bloco());
        return "while (" + condicao + ") {\n" + bloco + "\n}";
    }

    @Override
    public String visitLeitura(LuminParser.LeituraContext ctx) {
        String id = ctx.ID().getText();
        return id + " = scanner.nextInt();";
    }

@Override
public String visitEscritaID(LuminParser.EscritaIDContext ctx) {
    return "System.out.println(" + ctx.ID().getText() + ");";
}

@Override
public String visitEscritaString(LuminParser.EscritaStringContext ctx) {
    return "System.out.println(" + ctx.STRING().getText() + ");";
}



    @Override
    public String visitBloco(LuminParser.BlocoContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (LuminParser.ComandoContext comando : ctx.comando()) {
            builder.append(visit(comando)).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String visitExprInt(LuminParser.ExprIntContext ctx) {
        return ctx.NUM_INT().getText();
    }

    @Override
    public String visitExprReal(LuminParser.ExprRealContext ctx) {
        return ctx.NUM_REAL().getText();
    }

    @Override
    public String visitExprTrue(LuminParser.ExprTrueContext ctx) {
        return "true";
    }

    @Override
    public String visitExprFalse(LuminParser.ExprFalseContext ctx) {
        return "false";
    }

    @Override
    public String visitExprID(LuminParser.ExprIDContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitExprParenteses(LuminParser.ExprParentesesContext ctx) {
        return "(" + visit(ctx.expressao()) + ")";
    }

    @Override
    public String visitExprMulDiv(LuminParser.ExprMulDivContext ctx) {
        String esquerda = visit(ctx.expressao(0));
        String direita = visit(ctx.expressao(1));
        String op = ctx.op.getText();
        return esquerda + " " + op + " " + direita;
    }

    @Override
    public String visitExprSomaSub(LuminParser.ExprSomaSubContext ctx) {
        String esquerda = visit(ctx.expressao(0));
        String direita = visit(ctx.expressao(1));
        String op = ctx.op.getText();
        return esquerda + " " + op + " " + direita;
    }

    @Override
    public String visitExprRelacional(LuminParser.ExprRelacionalContext ctx) {
        String esquerda = visit(ctx.expressao(0));
        String direita = visit(ctx.expressao(1));
        String op = ctx.op.getText();
        return esquerda + " " + op + " " + direita;
    }
}
