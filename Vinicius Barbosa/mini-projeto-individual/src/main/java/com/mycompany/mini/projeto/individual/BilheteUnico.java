package com.mycompany.mini.projeto.individual;

import java.util.Scanner;

public class BilheteUnico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo a SptransTech");

        Integer contador = 0;
        Double saldoDiario = 0.0;
        Double saldoMensal = 0.0;

        while (contador == 0) {
            System.out.println("Para iniciarmos, escolha uma opção \n"
                    + "1 - Ônibus \n"
                    + "2 - Consultar Saldo Mensal \n"
                    + "3 - Consultar Sobra \n"
                    + "4 - Encerrar");
            Integer escolha = leitor.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.println("Informe a quantidade de ônibus diário: ");
                    Integer onibus = leitor.nextInt();
                    saldoDiario = (onibus * 4.40);
                    System.out.println(String.format("Seu saldo diário será de %.2f \n", saldoDiario));
                    break;
                }
                case 2 -> {
                    saldoMensal = saldoDiario * 22;
                    if (saldoMensal > 1 && saldoMensal < 200) {
                        System.out.println(String.format("Você deve morar pertinho da empresa \n"
                                + "Por isso seu saldo mensal é de: %.2f \n", saldoMensal));
                    } else if (saldoMensal > 200 && saldoMensal < 400) {
                        System.out.println(String.format("Você deve demorar um pouco para chegar na empresa \n"
                                + "Por isso seu saldo mensal é de: %.2f \n", saldoMensal));
                    } else if (saldoMensal >= 400) {
                        System.out.println(String.format("Você deve morar muito longe da empresa \n"
                                + "Por iso seu saldo mensal é de: %.2f \n", saldoMensal));
                    } else {
                        System.out.println("Você precisa informar a quantidade de ônibus na opção anterior!! \n");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Informe quantos dias você trabalhou");
                    Integer diasTrabalhados = leitor.nextInt();
                    if (diasTrabalhados >= 1 && diasTrabalhados <= 22) {
                        Double calculoSobra = saldoDiario * diasTrabalhados;
                        Double sobraBilhete = saldoMensal - calculoSobra;
                        System.out.println(String.format("Esse mês sobrou %.2f de saldo no seu bilhete \n", sobraBilhete));
                    }else{
                        System.out.println("Quantidade de dias inválido!");
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("Programa encerrado, até a próxima!");
                    contador++;
                    break;
                }
                default -> {
                    System.out.println("Opção inválida, tente novamente! \n");
                }
            }
        }

    }
}
