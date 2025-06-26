import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) throws IOException {
        String codigo = new String(Files.readAllBytes(Paths.get("exemplo.lumin")));

        LuminLexer lexer = new LuminLexer(CharStreams.fromString(codigo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LuminParser parser = new LuminParser(tokens);

        // Gera a árvore sintática
        ParseTree tree = parser.programa();

        // Analisador semântico
        ParseTreeWalker walker = new ParseTreeWalker();
        LuminSemantico analisador = new LuminSemantico();
        walker.walk(analisador, tree);

        // Se não houver erros semânticos, gerar código Java
        if (analisador.getErros().isEmpty()) {
            System.out.println("Código válido!");

            // Gerador de código Java
            LuminGeradorDeCodigo gerador = new LuminGeradorDeCodigo();
            String codigoGerado = gerador.visit(tree);  // Gera código Java

            // Salva o código Java gerado em um arquivo
            Files.write(Paths.get("Saida.java"), codigoGerado.getBytes());
            System.out.println("Código Java gerado com sucesso: Saida.java");
        } else {
            for (String erro : analisador.getErros()) {
                System.err.println("Erro semântico: " + erro);
            }
            System.exit(1);
        }

        // Exibe a árvore sintáticaS
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setScale(1.0f); // zoom
            viewer.setPreferredSize(new Dimension(1200, 800));

            // Coloca o viewer num painel com scroll
            JScrollPane scroll = new JScrollPane(viewer);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            // Cria a janela
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Árvore Sintática");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1300, 900);
                frame.setContentPane(scroll);
                frame.setVisible(true);
            });
    }

    // Função que exporta o componente para PNG 
    private static void exportarComoImagem(JComponent componente, String nomeArquivo) {
        Dimension tamanho = componente.getPreferredSize();
        componente.setSize(tamanho);

        BufferedImage imagem = new BufferedImage(
            tamanho.width,
            tamanho.height,
            BufferedImage.TYPE_INT_RGB // Fundo branco
        );

        Graphics2D g2 = imagem.createGraphics();
        g2.setColor(Color.WHITE); // Define cor de fundo
        g2.fillRect(0, 0, tamanho.width, tamanho.height); // Pinta fundo de branco
        componente.paint(g2);
        g2.dispose();

        try {
            ImageIO.write(imagem, "png", new File(nomeArquivo));
        } catch (IOException e) {
            System.err.println(" Erro ao salvar imagem: " + e.getMessage());
        }
    }
}