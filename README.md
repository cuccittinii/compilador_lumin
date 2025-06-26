
# 💡 Compilador da Linguagem Lumin

Este projeto implementa um compilador simples em Java, utilizando ANTLR (Another Tool for Language Recognition), para a linguagem fictícia Lumin. O compilador realiza análise léxica, sintática e semântica, além de gerar código Java correspondente a programas escritos em `.lumin`.

---

## 🚀 Funcionalidades

- Análise Léxica e Sintática via ANTLR 4.13.1
- Análise Semântica implementada com um Listener personalizado
- Geração de código Java utilizando o padrão Visitor
- Visualização gráfica da árvore sintática
- Exportação automática do código Java gerado para o arquivo `Saida.java`

---

## 📁 Estrutura do Projeto

Linguagem Lumin/
├── Lumin.g4 # Gramática da linguagem Lumin (ANTLR)

├── exemplo.lumin # Código de exemplo na linguagem Lumin

├── LuminLexer.java # Gerado pelo ANTLR

├── LuminParser.java # Gerado pelo ANTLR

├── LuminBaseVisitor.java # Gerado pelo ANTLR

├── LuminVisitor.java # Gerado pelo ANTLR

├── LuminBaseListener.java # Gerado pelo ANTLR

├── LuminListener.java # Gerado pelo ANTLR

├── Teste.java # Arquivo principal do compilador

├── LuminSemantico.java # Implementação da análise semântica

├── LuminGeradorDeCodigo.java # Implementação da geração de código Java

├── Saida.java # Código Java gerado (ignorado pelo Git)

├── antlr-4.13.1-complete.jar # Biblioteca ANTLR

└── .gitignore **# Arquivos ignorados no versionamento**

---

## 🛠️ Pré-requisitos

- Java Development Kit (JDK) 17 ou superior  
- Terminal compatível (CMD, PowerShell ou Bash)  
- Biblioteca `antlr-4.13.1-complete.jar` no diretório raiz do projeto  

---

## ⚙️ Como Utilizar

### 1️⃣ Gerar arquivos da gramática com ANTLR

```
java -jar antlr-4.13.1-complete.jar -no-listener -visitor Lumin.g4
```

### 2️⃣ Compilar os arquivos Java

`javac -cp ".;antlr-4.13.1-complete.jar" *.java`

💡 Dica: No Linux/macOS, substitua por no classpath.. ;.:

### 3️⃣ Executar o analisador
`java -cp ".;antlr-4.13.1-complete.jar" Teste`

Este passo realiza:

Leitura do arquivo exemplo.lumin
Análises léxica, sintática e semântica
Geração do arquivo (se o código Lumin for válido)Saida.java
Exibição gráfica da árvore sintática

### 4️⃣ Executar o código Java gerado
```
javac Saida.java
java Saida
```
**🧪 Exemplo do Código .lumin atual**

```
clarus x
x = 5
escreva x
```
Esse código realiza:

* Declaração de uma variável inteira x
* Atribuição do valor 5 à variável x
* Impressão do valor de x no console

### **Código executavel gerado pela compilação para a linguagem java no arquivo Saida.java**
```
import java.util.Scanner;
public class Saida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = 5;
    System.out.println(x);

    }
}
```
**Saída esperada ao executar o código Java gerado:**

`5`

**📌 Arquivos Ignorados (.gitignore)**

**O projeto ignora:**

1. Arquivos compilados do Java.class
1. Arquivos temporários do ANTLR (, .tokens.interp)
1. Arquivo de saída gerado Saida.java
1. Pastas de configuração de IDEs (, .vscode/.idea/)

**🤝 Contribuições**

Autor | Função
--- | ---
Iago Pisa Bandeira | Desenvolvedor

**Obrigado por conferir este projeto!**
