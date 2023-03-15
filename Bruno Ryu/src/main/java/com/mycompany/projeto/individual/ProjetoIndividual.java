package com.mycompany.projeto.individual;
import java.util.Scanner;

public class ProjetoIndividual {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        Login login = new Login();
        Boolean repetir = true;
        
        while(repetir){
            System.out.println("\n\nDigite a função que desejar\n1 - Calculadora\n2 - Login\n3 - Simulador Financeiro\n0 - Sair");
            Integer opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite qual operação quer fazer:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
                    Integer operacao = leitor.nextInt();

                    System.out.println("Digite um número:");
                    Double numero01 = leitor.nextDouble();

                    System.out.println("Digite outro número:");
                    Double numero02 = leitor.nextDouble();

                    System.out.println(calc.calcular(operacao, numero01, numero02));
                    break;

                case 2:
                    System.out.println("Digite o nome de usuário:");
                    String usuarioDigitado = leitor.next();
                    
                    System.out.println("Digite a senha:");
                    Integer senhaDigitada = leitor.nextInt();
                    
                    System.out.println(login.devolverLogin(usuarioDigitado, senhaDigitada));
                    break;
                    
                case 3:
                    System.out.println("Quanto deseja Investir?");
                    Double valorInvestido = leitor.nextDouble();
                    for(Integer i = 1; i <=12; i++){
                        valorInvestido *= 1.1;
                        System.out.println(String.format("Mês %dº - R$%.2f", i, valorInvestido));
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por usar o sistema ProjetoIndividual");
                    repetir = false;
                    break;
                
                default:
                    System.out.println("Digite uma opção válida!\n");
                    break;
            }
        }
    }
}
