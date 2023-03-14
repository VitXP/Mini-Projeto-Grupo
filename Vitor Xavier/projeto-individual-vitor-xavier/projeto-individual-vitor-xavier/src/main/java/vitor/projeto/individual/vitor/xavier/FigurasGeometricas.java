/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.projeto.individual.vitor.xavier;

/**
 *
 * @author vitor
 */
public class FigurasGeometricas {

    void exibirQuadradoTrianguloRetangulo() {
        System.out.println(String.format("\n              - Figuras Geométricas - \n \n \n"
                + "+--------------+          /\\          +----------------------+      \n"
                + "|              |         /  \\         |                      |      \n"
                + "|              |        /    \\        |                      |      \n"
                + "|              |       /      \\       |                      |      \n"
                + "|              |      /        \\      |                      |      \n"
                + "|              |     /          \\     |                      |      \n"
                + "|              |    /            \\    |                      |      \n"
                + "+--------------+    --------------    +----------------------+      \n"
        )
        );
    }

    void exibirQuadrado() {
        System.out.println(String.format(
                "  +------------+\n"
                + "  |            |\n"
                + "  |            |\n"
                + "l |            |\n"
                + "  |            |\n"
                + "  |            |\n"
                + "  +------------+\n"
        )
        );
    }

    void exibirTrianguloRetangulo() {
        System.out.println(String.format(
                "   |\\\n"
                + "   | \\\n"
                + "   |  \\\n"
                + "   |   \\\n"
                + " a |    \\  c\n"
                + "   |     \\\n"
                + "   |      \\\n "
                + "  |       \\\n"
                + "   +--------\n"
                + "      b   "
        )
        );
    }

    void exibirRetangulo() {
        System.out.println(String.format(
                "  +---------------------------------+\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "a |                                 |\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "  +---------------------------------+\n"
                + "               b"
        )
        );
    }

    void separar() {
        System.out.println("\n\n---------------------------------------------------------------------------------");
    }

    void separarFinal() {
        System.out.println("---------------------------------------------------------------------------------\n\n");
    }

    Double calcularPerimetroQuadrado(Double medidaLadoQuadrado) {
        return medidaLadoQuadrado * 4;
    }

    Double calcularAreaQuadrado(Double medidaLadoQuadrado) {
        return medidaLadoQuadrado * medidaLadoQuadrado;
    }

    Double calcularPerimetroTriangulo(Double ladoA, Double ladoB, Double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    Double calcularAreaTriangulo(Double base, Double altura) {
        return base * altura / 2;
    }

    Double calcularPerimetroRetangulo(Double altura, Double base) {
        return 2 * (altura + base);
    }

    Double calcularAreaRetangulo(Double altura, Double base) {
        return altura * base;
    }

    void ExibirQuadradoSeria() {
        System.out.println(String.format(
                "+------------+\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"
                + "+------------+\n"
        )
        );
    }

    void exibirTrianguloSeria() {
        System.out.println(String.format(
                "      /\\         \n"
                + "     /  \\        \n"
                + "    /    \\       \n"
                + "   /      \\      \n"
                + "  /        \\     \n"
                + " /          \\    \n"
                + "/            \\   \n"
                + "--------------    \n"
        )
        );
    }

    void exibirRetanguloSeria() {
        System.out.println(String.format(
                "+---------------------------------+\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "+---------------------------------+\n"
        )
        );
    }

    void exibirOctogonoSeria() {
        System.out.println(String.format(
                "   +----------+\n"
                + "  /            \\\n"
                + " /              \\\n"
                + "+                +\n"
                + "|                |\n"
                + "+                +\n"
                + " \\              /\n"
                + "  \\            /\n"
                + "   +----------+\n"
        ));

    }

    void exibirHexagonoSeria() {
        System.out.println("    /\\\n"
                + "   /  \\\n"
                + "  /    \\\n"
                + " /      \\\n"
                + "/        \\\n"
                + "\\        /\n"
                + " \\      /\n"
                + "  \\    /\n"
                + "   \\  /\n"
                + "    \\/");
    }

    void exibirLosangoSeria() {
        System.out.println("   +--------------+ \n"
                + "  /               / \n"
                + " /               /  \n"
                + "/               /   \n"
                + "+--------------+     \n");
    }

    String converterNumeroSorteado(Integer numeroSorteado) {

        if (numeroSorteado == 1) {
            return "Triângulo";
        } else if (numeroSorteado == 2) {
            return "Quadrado";
        } else if (numeroSorteado == 3) {
            return "Circulo";
        } else if (numeroSorteado == 4) {
            return "Retangulo";
        } else if (numeroSorteado == 5) {
            return "Decágono";
        } else if (numeroSorteado == 6) {
            return "Hexágono";
        } else if (numeroSorteado == 7) {
            return "Eneágono";
        } else if (numeroSorteado == 8) {
            return "Pentágono";
        } else if (numeroSorteado == 9) {
            return "Quadrilátero";
        } else {
            return "Trapézio";
        }
    }

    // Quiz 
    Integer retornarRespostaPergunta1Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 6) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é 6.\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta2Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 3) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é 3.\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta3Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 7) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é 7.\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta4Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 0) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é 0.\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta5Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 1) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é Sim(1).\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta6Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 2) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é Não(2).\n"));
            return pontuacao;
        }

    }

    Integer retornarRespostaPergunta7Quiz(Integer respostaDigitada, Integer pontuacao) {

        pontuacao = 0;

        if (respostaDigitada == 11) {
            System.out.println(String.format("Parabéns, respota correta!\n"));
            return 1;

        } else {
            System.out.println(String.format("A resposta correta é 11.\n"));
            return pontuacao;
        }

    }
}
