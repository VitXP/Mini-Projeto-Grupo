/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thamiris.projeto.individual.sprint1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author thami
 */
public class JogoPerguntas {

    // Variáveis para contabilizar os pontos e respostas corretas
    Integer contadorPontos = 0;
    Integer contadorRespostasCertas = 0;
    Boolean respostaCorreta;

    // Método para exibir as opções de resposta
    void exibirOpcaoVerdadeiroFalso() {
        System.out.println("Digite o número da opção correspondente\n"
                + "1 - Verdadeiro\n"
                + "2 - Falso\n");
    }

    // Método para exibir a validação das respostas
    void exibirResultadoQuestao() {
        if (respostaCorreta == true) {
            String resultadoQuestao = String.format("Resposta CORRETA!\nPontuação: %d\n", contadorPontos);
            System.out.println(resultadoQuestao);
        } else {
            String resultadoQuestao = String.format("Resposta INCORRETA!\n", contadorPontos);
            System.out.println(resultadoQuestao);
        }

    }

    // Método para exibir a pontuação final e perguntar se deseja jogar novamenre
    void exibirPontuacaoFinal() {
        String mensagemFinal = String.format("Pontuação final: %d\nQuestões acertadas: %d",
                contadorPontos, contadorRespostasCertas);
        System.out.println(mensagemFinal);

        System.out.println("Deseja jogar novamente?\n"
                + "1 - Sim\n"
                + "2 - Não\n");
    }

    // Método criado para resetar os pontos caso o usuário queira jogar novamente
    void reiniciaPontuacao(Integer desejaJogarNovamente) {
        if (desejaJogarNovamente == 1) {
            contadorPontos = 0;
            contadorRespostasCertas = 0;
        }  
    }

    // Método para exibir apenas a questão e as opções de resposta
    void exibirPergunta(Integer i) {
        switch (i) {

            case 1:
                System.out.println("1) Nível fácil (100 pontos):\n"
                        + "Análise de Sistemas procura atuar como suporte a qualidade e produtividade de uma empresa.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 2:
                System.out.println("2) Nível fácil (100 pontos):\n"
                        + "Um sistema é composto por: Entrada, Processamento e Saída de dados.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 3:
                System.out.println("3) Nível fácil (100 pontos):\n"
                        + "Sistema Operacional é um software que gerencia recursos e informações da máquina.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 4:
                System.out.println("4) Nível fácil (100 pontos):\n"
                        + "Em Java não é preciso declarar o tipo da variável ao inicia-la.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 5:
                System.out.println("5) Nível médio (300 pontos):\n"
                        + "Abstração de recursos é ideação e facilitação de ações para o usuário.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 6:
                System.out.println("6) Nível médio (300 pontos):\n"
                        + "O Sistema Operacional Linux é uma distribuição.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 7:
                System.out.println("7) Nível médio (300 pontos):\n"
                        + "Análise de Sistema é o poder decisório de uma empresa, com base em modelos de informação.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 8:
                System.out.println("8) Nível difícil (500 pontos):\n"
                        + "Proto-persona se trata de um indivíduo específico com comportamentos próprios que são relevantes ao negócio.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 9:
                System.out.println("9) Nível difícil (500 pontos):\n"
                        + "Mesmo que o grupo esteja dividido, o importante são as entregas na Sprint.");
                exibirOpcaoVerdadeiroFalso();
                break;

            case 10:
                System.out.println("10) Nível difícil (500 pontos):\n"
                        + "O compilador gera o programa equivalente em linguagem de baixo nível.");
                exibirOpcaoVerdadeiroFalso();
                break;

        }
    }

    // Método para exibir a validação da resposta dada pelo usuário
    // Note que: cada questão possui um nível de dificuldade e uma resposta diferente (Verdadeiro ou Falso)
    void retornarPerguntaComResposta(String respostaDigitada, Integer i) {

        switch (i) {

            case 1:
                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 100;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 2:
                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 100;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 3:
                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 100;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 4:
                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 100;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 5:
                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 300;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }

                break;

            case 6:
                if (respostaDigitada.equals("2")) {
                    respostaCorreta = true;
                    contadorPontos += 300;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("1")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 7:
                if (respostaDigitada.equals("2")) {
                    respostaCorreta = true;
                    contadorPontos += 300;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("1")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 8:
                if (respostaDigitada.equals("2")) {
                    respostaCorreta = true;
                    contadorPontos += 500;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("1")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 9:
                if (respostaDigitada.equals("2")) {
                    respostaCorreta = true;
                    contadorPontos += 500;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("1")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

            case 10:
                exibirOpcaoVerdadeiroFalso();

                if (respostaDigitada.equals("1")) {
                    respostaCorreta = true;
                    contadorPontos += 500;
                    contadorRespostasCertas++;
                    exibirResultadoQuestao();
                } else if (respostaDigitada.equals("2")) {
                    respostaCorreta = false;
                    exibirResultadoQuestao();
                }
                break;

        }

    }

}
