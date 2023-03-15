/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thamiris.projeto.individual.sprint1;

import java.util.Scanner;

/**
 *
 * @author thami
 */
public class TestePrincipal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("***Seja bem-vindo(a) ao meu projeto individual da SPTech!***\n");

        System.out.println("Por gentileza, informe seu nome: ");
        String nomeDigitado = leitor.nextLine();

        // Chamando o método para exibir as frases iniciais ao usuário
        MensagemInicial msgInicial = new MensagemInicial();
        System.out.println(msgInicial.mensagemInicial(nomeDigitado));

        // Pré definição da variável de opção de escolha
        Integer opcaoEscolhida;

        // Criando uma estrutura de repetição
        do {
            System.out.println(msgInicial.menuEscolhas());
            opcaoEscolhida = leitor.nextInt();

            if (opcaoEscolhida == 4) {
                // Caso o usuário clique em "4 - Sair", será encerrada a execução
            } else {

                switch (opcaoEscolhida) {
                    case 1:
                        msgInicial.exibirOpcaoEscolhida(opcaoEscolhida);
                        msgInicial.exibirLinha();

                        System.out.println("Digite a sua nota final da AC1: ");
                        Double notaAC1 = leitor.nextDouble();

                        System.out.println("Digite a sua nota final da AC2: ");
                        Double notaAC2 = leitor.nextDouble();

                        System.out.println("Digite a sua nota final da AC3: ");
                        Double notaAC3 = leitor.nextDouble();

                        // Chamando o método para calcular média das continuadas
                        CalculoMediaACFinal calcMediaAC = new CalculoMediaACFinal();
                        Double resultadoCalculoMediaAC = calcMediaAC.calculaMediaACTotal(notaAC1, notaAC2, notaAC3);

                        String resultadoMediaAC = String.format("MÉDIA DAS AVALIAÇÕES CONTINUADAS: %.2f", resultadoCalculoMediaAC);
                        System.out.println(resultadoMediaAC);
                        break;

                    case 2:
                        msgInicial.exibirOpcaoEscolhida(opcaoEscolhida);
                        msgInicial.exibirLinha();

                        System.out.println("Digite a sua MÉDIA FINAL das Avaliações Continuadas: ");
                        Double mediaAvaliacaoContinuada = leitor.nextDouble();

                        System.out.println("Digite a sua NOTA na Avaliação Integrada: ");
                        Double notaProvaIntegrada = leitor.nextDouble();

                        // Chamando o método para calcular a média final e saber se foi aprovado
                        CalculaMediaFinal calcMediaFinal = new CalculaMediaFinal();
                        Double notaFinal = calcMediaFinal.calcularMediaFinalSemestre(mediaAvaliacaoContinuada, notaProvaIntegrada);

                        // Exibindo o resultado final
                        String resultadoNotaFinal = String.format("MÉDIA FINAL DO SEMESTRE: %.2f", notaFinal);
                        System.out.println(resultadoNotaFinal);

                        System.out.println(calcMediaFinal.retornarStatusDesempenho(notaFinal));

                        System.out.println(calcMediaFinal.retornarAprovacao(notaFinal, nomeDigitado));
                        calcMediaFinal.retornarStatusDesempenho(notaFinal);
                        break;

                    case 3:
                        msgInicial.exibirOpcaoEscolhida(opcaoEscolhida);
                        msgInicial.exibirLinha();

                        // Chamando o método para sortear uma mensagem
                        ConselhosEstudantes conselhosEst = new ConselhosEstudantes();
                        String resultadoConselhos = conselhosEst.retornarConselhoEstudante();

                        String fraseConselhosEstudantes = String.format("%s, temos um conselho para você:\n %s", nomeDigitado, resultadoConselhos);
                        System.out.println(fraseConselhosEstudantes);
                        break;

                    case 5:

                        msgInicial.exibirOpcaoEscolhida(opcaoEscolhida);
                        msgInicial.exibirLinha();

                        // Chamando o método para exibir as perguntas e validar respostas
                        JogoPerguntas jogoPerg = new JogoPerguntas();
                        Integer desejaJogarNovamente = 0;

                        do {
                            if (desejaJogarNovamente == 2) {
                                // Finaliza a execução do jogo
                            } else {
                                msgInicial.mensagemInicioJogo(nomeDigitado);
                                for (int i = 0; i < 11; i++) {
                                    jogoPerg.exibirPergunta(i);
                                    String respostaDigitada = leitor.nextLine();

                                    // Exibindo o resultado final da questão
                                    jogoPerg.retornarPerguntaComResposta(respostaDigitada, i);
                                    msgInicial.exibirLinha();
                                }

                                // Exibindo os pontos e quantidade de questões acertadas 
                                jogoPerg.exibirPontuacaoFinal();
                                msgInicial.exibirLinha();

                                // Perguntando se deseja jogar novamente
                                desejaJogarNovamente = leitor.nextInt();
                                
                                // Chamando o método de reiniciar os pontos
                                jogoPerg.reiniciaPontuacao(desejaJogarNovamente);
                                
                            }
                        } while (desejaJogarNovamente != 2);

                        // Break da opção 5 do menu principal
                        break;

                    // Default do menu principal
                    default:
                        System.out.println("Opção inválida, tente novamente!");
                }
            }
        } while (opcaoEscolhida != 4);

    }
}
