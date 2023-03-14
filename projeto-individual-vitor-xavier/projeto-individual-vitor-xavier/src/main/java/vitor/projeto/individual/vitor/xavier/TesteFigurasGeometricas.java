/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.projeto.individual.vitor.xavier;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vitor
 */
public class TesteFigurasGeometricas {

    public static void main(String[] args) {

        FigurasGeometricas fig = new FigurasGeometricas();

        Scanner leitor = new Scanner(System.in);
        Integer operacaoSelecionada = 0;
        fig.exibirQuadradoTrianguloRetangulo();
        Integer pontuacaoQuiz = 0;

        do {
            System.out.println(String.format(" \n"
                    + "1 - Cálculo (Área e Perímetro)           \n"
                    + "2 - Adivinhação de Figuras Geométricas   \n"
                    + "3 - Gerador De Figuras Geométricas       \n"
                    + "4 - Quiz (Figuras Geométricas)           \n"
                    + "0 – Sair"));

            operacaoSelecionada = leitor.nextInt();

            switch (operacaoSelecionada) {

                //Cálculo
                case 1:
                    fig.separar();
                    System.out.println(String.format("Digite o número da Figura Geométrica, no qual deseja realizar o cálculo:"));
                    System.out.println(String.format(
                            "1 - Quadrado\n"
                            + "2 - Triangulo Retângulo\n"
                            + "3 - Retangulo\n"
                            + "4 - Voltar ao Menu"
                    ));

                    Integer numeroMenu = leitor.nextInt();

                    switch (numeroMenu) {
                        case 1:
                            fig.exibirQuadrado();
                            System.out.println(String.format("Digite a medida do Lado (L) do quadrado em centímetros"));
                            Double medidaLadoQuadradoDigitada = leitor.nextDouble();

                            Double perimetroQuadrado = fig.calcularPerimetroQuadrado(medidaLadoQuadradoDigitada);
                            Double areaQuadrado = fig.calcularAreaQuadrado(medidaLadoQuadradoDigitada);

                            System.out.println(String.format("A área do quadrado é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaQuadrado, perimetroQuadrado));
                            fig.separarFinal();

                            break;

                        case 2:
                            fig.exibirTrianguloRetangulo();
                            System.out.println(String.format("Digite a medida do Lado A (Altura) do triangulo em centímetros"));
                            Double medidaLadoATrianguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado B (Base) do triangulo em centímetros"));
                            Double medidaLadoBTrianguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado C (Hipotenusa) do triangulo em centímetros"));
                            Double medidaLadoCTrianguloDigitada = leitor.nextDouble();

                            Double perimetroTriangulo = fig.calcularPerimetroTriangulo(medidaLadoATrianguloDigitada, medidaLadoBTrianguloDigitada, medidaLadoCTrianguloDigitada);
                            Double areaTriangulo = fig.calcularAreaTriangulo(medidaLadoBTrianguloDigitada, medidaLadoATrianguloDigitada);

                            System.out.println(String.format("A área do triangulo é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaTriangulo, perimetroTriangulo));
                            fig.separarFinal();
                            break;

                        case 3:
                            fig.exibirRetangulo();
                            System.out.println(String.format("Digite a medida do Lado A (Altura) do retângulo em centímetros"));
                            Double medidaLadoARetanguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado B (Base) do retângulo em centímetros"));
                            Double medidaLadoBRetanguloDigitada = leitor.nextDouble();

                            Double perimetroRetangulo = fig.calcularPerimetroRetangulo(medidaLadoARetanguloDigitada, medidaLadoBRetanguloDigitada);
                            Double areaRetangulo = fig.calcularAreaRetangulo(medidaLadoARetanguloDigitada, medidaLadoBRetanguloDigitada);

                            System.out.println(String.format("A área do retângulo é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaRetangulo, perimetroRetangulo));
                            fig.separarFinal();
                            break;

                        case 4:
                            fig.separarFinal();

                            break;

                        default:
                            System.out.println(String.format("Opção inválida! Redirecionando ao menu! :)"));
                            fig.separarFinal();
                    }

                    break;

                //Adivinhação
                case 2:
                    fig.separar();
                    System.out.println(String.format("-Adivinhação De Figuras Geométricas-  \n"));

                    System.out.println(String.format("Digite um Número referente a figura Geométrica no qual você acha que será sorteada:"));
                    System.out.println(String.format("1 - Triângulo \n"
                            + "2 - Quadrado\n"
                            + "3 - Circulo\n"
                            + "4 - Retangulo\n"
                            + "5 - Decágono\n"
                            + "6 - Hexágono\n"
                            + "7 - Eneágono\n"
                            + "8 - Pentágono\n"
                            + "9 - Quadrilátero\n"
                            + "10 -Trapézio\n"));

                    Integer numeroDigitado = leitor.nextInt();
                    Integer figuraAleatoria = ThreadLocalRandom.current().nextInt(1, 10);
                    String nomeSorteado = fig.converterNumeroSorteado(figuraAleatoria);

                    if (numeroDigitado > 10 || numeroDigitado <= 0) {
                        System.out.println(String.format("Número Inválido! Redirecionando ao menu! :)"));
                        break;
                    }

                    if (numeroDigitado == figuraAleatoria) {
                        System.out.println(String.format("Parabéns! Você acertou a figura sorteada, sendo ela o %s ", nomeSorteado));
                    } else {
                        System.out.println(String.format("Você errou! A figura sorteada foi o %s", nomeSorteado));
                    }

                    fig.separarFinal();
                    break;

                //Gerador
                case 3:
                    fig.separar();
                    System.out.println(String.format("-Gerador De Figuras Geométricas-  \n"));

                    System.out.println(String.format("Digite o número da Figura Geométrica, no qual deseja realizar a criação:"));
                    System.out.println(String.format(
                            "1 - Quadrado\n"
                            + "2 - Triangulo Retângulo\n"
                            + "3 - Retangulo\n"
                            + "4 - octógono\n"
                            + "5 - Hexágono \n"
                            + "6 - Losango   \n"
                            + "7 - Voltar ao Menu"
                    ));

                    Integer numeroDigitadoCriacao = leitor.nextInt();

                    switch (numeroDigitadoCriacao) {
                        case 1:
                            fig.ExibirQuadradoSeria();
                            fig.separarFinal();
                            break;

                        case 2:
                            fig.exibirTrianguloSeria();
                            fig.separarFinal();
                            break;

                        case 3:
                            fig.exibirRetanguloSeria();
                            fig.separarFinal();

                            break;

                        case 4:
                            fig.exibirOctogonoSeria();
                            fig.separarFinal();
                            break;

                        case 5:
                            fig.exibirHexagonoSeria();
                            fig.separarFinal();

                            break;

                        case 6:
                            fig.exibirLosangoSeria();
                            fig.separarFinal();
                            break;

                        case 7:
                            fig.separarFinal();
                            break;

                        default:
                            System.out.println(String.format("Opção inválida! Redirecionando ao menu! :)"));
                            fig.separarFinal();
                    }

                    break;

                //Quiz
                case 4:

                    fig.separar();
                    Integer pontuacao = 0;

                    System.out.println(String.format("-Seja Bmem vindo(a) ao quiz de Figuras Geométricas- \n\n"));

                    System.out.println(String.format("1 - Quantos faces tem um retangulo?"));
                    Integer respostaDigitada = leitor.nextInt();
                    Integer retorno1 = fig.retornarRespostaPergunta1Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno1;

                    System.out.println(String.format("2 - Quantos vértices tem um triângulo"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno2 = fig.retornarRespostaPergunta2Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno2;

                    System.out.println(String.format("3 - Quantos tipos de triângulo existem?"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno3 = fig.retornarRespostaPergunta3Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno3;

                    System.out.println(String.format("4 - quantos vertices tem um circulo"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno4 = fig.retornarRespostaPergunta4Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno4;

                    System.out.println(String.format("5 - Eneágono é uma Figura Geométrica? \n 1-Sim \n 2-Não"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno5 = fig.retornarRespostaPergunta5Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno5;

                    System.out.println(String.format("6 - O Pentadecágono possui 10 lados? \n 1-Sim \n 2-Não"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno6 = fig.retornarRespostaPergunta6Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno6;

                    System.out.println(String.format("7 - O Undecágono possui quantos lados?"));
                    respostaDigitada = leitor.nextInt();
                    Integer retorno7 = fig.retornarRespostaPergunta7Quiz(respostaDigitada, pontuacao);
                    pontuacao = pontuacao + retorno7;

                    fig.separar();
                    
                    System.out.println(String.format("\nVocê acertou %d/7 questões.\n", pontuacao));
                    fig.separarFinal();
                    break;

                //Sair
                case 0:
                    System.out.println(String.format("Até logo! :)"));
                    break;

                //Default
                default:
                    System.out.println(String.format("Opção inválida!"));

            }

        } while (operacaoSelecionada
                != 0);

    }

}
