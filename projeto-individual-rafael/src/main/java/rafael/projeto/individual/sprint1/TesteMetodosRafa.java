/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rafael.projeto.individual.sprint1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rafae
 */
public class TesteMetodosRafa {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        MetodosRafa rafa = new MetodosRafa();
        //Importante lembrar que a condicional para finalizar o do while baseiase em um boleano
        boolean sair =false;
        do{
            System.out.println("Digite um número para escolher uma utilidade do pacote Rafão: \n"
                +   "1 - Calculadora de resolução da equação de Bhaskhara; \n"+
                    "2 - Contador de piadas; \n"+
                    "3 - Simulador de dividas; \n"+
                    "4 - Jokempo; \n"+
                    "5 - Sair; \n");
            Integer operacaoDesejada=leia.nextInt();
            
            
            switch (operacaoDesejada) {
                case 1:                    
                    System.out.println("Olá, então para resolver uma equação vale lembrar que \n"
                            + "esta equação possui três valores determinantes, que são \n"
                            + "o coeficiente de variação angular, o coeficiente linear e a soma \n"
                            + "sendo conhecidos como 'a', 'b', e 'c' na equação \n"
                            + "a*x^2+b*x+c=0 :");
                    System.out.println("Primeiramente digite o valor de a:");
                    Double valora = leia.nextDouble();
                    System.out.println("Agora digite o valor de b:");
                    Double valorb = leia.nextDouble();
                    System.out.println("Por último é importante digitar o valor de c:");
                    Double valorc = leia.nextDouble();
                    String resposta;
                    resposta = rafa.calcularSolucoesQuadraticas(valora, valorb, valorc);
                    System.out.println(resposta);
                    break;
                case 2:
                    System.out.println("Olá, você inicializou um contador de piadas, para inicializar: \n"
                            + "1 - Piada de programador \n"
                            + "2 - Binários \n"
                            + "3 - LAPTOP....... \n"
                            + "4 - Qual o filme? \n");
                    System.out.println("Escolha o número correspondente:");
                    Integer selecao=leia.nextInt();
                    String resposta2;
                    resposta2=rafa.contadorDePiadas(selecao);
                    System.out.println(resposta2);
                    break;
                case 3:
                    System.out.println("Você acabou de inicializar um simulador de dividas escolha uma opção: \n"
                            + "1 - Divida com Juros Simples \n"
                            + "2 - Divida com Juros Compostos \n");
                    Double sele=leia.nextDouble();
                    if (sele==1.0){
                        System.out.println("Digite agora o valor do Capital Inicial investido:");
                        Double capitalInicial=leia.nextDouble();
                        System.out.println("Agora a Taxa de Juros ao mês:");
                        Double taxaDeJuros=leia.nextDouble();
                        System.out.println("Por fim o tempo de investimento:");
                        Double tempoAplicacao=leia.nextDouble();
                        Double roi= rafa.jurosSimples(capitalInicial,taxaDeJuros,tempoAplicacao);
                        System.out.println(String.format("O Roi de investimentos com valor inicial igual a %.2f com taxa de juros de %.2f apllicado durante %.2f meses é de %.2f",capitalInicial,taxaDeJuros,tempoAplicacao,roi));
                        
                    } else if (sele==2.0){
                        System.out.println("Digite agora o valor do Capital Inicial investido:");
                        Double capitalInicial=leia.nextDouble();
                        System.out.println("Agora a Taxa de Juros ao mês:");
                        Double taxaDeJuros=leia.nextDouble();
                        System.out.println("Por fim o tempo de investimento:");
                        Double tempoAplicacao=leia.nextDouble();
                        Double roi= rafa.jurosCompostos(capitalInicial,taxaDeJuros,tempoAplicacao);
                        System.out.println(String.format("O Roi de investimentos com valor inicial igual a %.2f com taxa de juros de %.2f apllicado durante %.2f meses é de %.2f",capitalInicial,taxaDeJuros,tempoAplicacao,roi));
                    }
                    
                    break;
                case 4:
                    Boolean sairJokempo=false;
                    Integer pontuacaosing1=0;
                    Integer pontuacaosing2=0;
                    Integer pontuacaomulti1=0;
                    Integer pontuacaomulti2=0;
                        do{
                            System.out.println("Você inicializou o jogo Jokempo, você pode escolher\n"
                                    + "1 - Jogar com a maquina \n"
                                    + "2 - Jogar com outra pessoa \n"
                                    + "3 - Sair");
                            Integer seleJokemp=leia.nextInt();

                            if(seleJokemp==1){
                                Boolean sairdaqui=false;
                                do{
                                    System.out.println("Jogando com máquina");
                                    System.out.println("""
                                                       Digite 1,2 ou 3 se deseja jogar:
                                                       Para sair do jogo digite 0...
                                                       1 - Pedra
                                                            _______
                                                        ---'   ____)
                                                              (_____)
                                                              (_____)
                                                              (____)
                                                        ---.__(___)

                                                       2 - Papel
                                                            _______
                                                        ---'    ____)____
                                                                   ______)
                                                                  _______)
                                                                 _______)
                                                        ---.__________)

                                                       3 - Tesoura 

                                                           _______
                                                        ---'   ____)____
                                                                  ______)
                                                               __________)
                                                              (____)
                                                        ---.__(___)

                                                       """);
                                    Integer maoJogador1=leia.nextInt();
                                    if(maoJogador1==0){
                                        sairdaqui=true;                                        
                                    }else if(maoJogador1<0||maoJogador1>3){
                                        System.out.println("Digite um dos números permitidos!");
                                    }else{
                                        String fraseganhador="";
                                        Integer maoMaquina=ThreadLocalRandom.current().nextInt(1,4);
                                        String[] maoplayer=rafa.maoJokempo(maoJogador1);                                        
                                        String[] maomaquina=rafa.maoJokempo(maoMaquina);
                                        System.out.println("Você jogou:");
                                        System.out.println(maoplayer[0]);
                                        System.out.println("\nX\n");
                                        System.out.println("Seu adversário:");
                                        System.out.println(maomaquina[0]); 
                                        String frasedoganhador= rafa.quemGanha(maoplayer, maomaquina);
                                        System.out.println(frasedoganhador);
                                        Integer selecao1=Integer.valueOf(maoplayer[1]);
                                        Integer selecao2=Integer.valueOf(maomaquina[1]);
                                        Integer[] pontuacaoacumuladora = rafa.pontuacaoAcumuladora(selecao1, selecao2);
                                        pontuacaosing1+=pontuacaoacumuladora[0];
                                        pontuacaosing2+=pontuacaoacumuladora[1];
                                        System.out.println(String.format("Pontuação atual: \n"
                                                + "Jogador 1 = %d",pontuacaosing1));
                                        System.out.println(String.format("\nMaquina = %d",pontuacaosing2));
                                    }
                                    
                                }while(sairdaqui==false);
                                
                                //Método para jogar com a maquina
                            }else if(seleJokemp==2){
                                Boolean sairdaqui=false;
                                do{
                                    System.out.println("Jogando com alguém");
                                    System.out.println("""
                                                       Jogador1, escolha 1,2 ou 3 se deseja jogar:
                                                       Para encerrar digite 0
                                                       1 - Pedra
                                                            _______
                                                        ---'   ____)
                                                              (_____)
                                                              (_____)
                                                              (____)
                                                        ---.__(___)

                                                       2 - Papel
                                                            _______
                                                        ---'    ____)____
                                                                   ______)
                                                                  _______)
                                                                 _______)
                                                        ---.__________)

                                                       3 - Tesoura 

                                                           _______
                                                        ---'   ____)____
                                                                  ______)
                                                               __________)
                                                              (____)
                                                        ---.__(___)

                                                       """);
                                    Integer maoJogador1=leia.nextInt();

                                    System.out.println("""
                                                       Jogador2, escolha 1,2 ou 3 se deseja jogar:
                                                       Para encerrar o jogo basta digitar 0
                                                       1 - Pedra
                                                            _______
                                                        ---'   ____)
                                                              (_____)
                                                              (_____)
                                                              (____)
                                                        ---.__(___)

                                                       2 - Papel
                                                            _______
                                                        ---'    ____)____
                                                                   ______)
                                                                  _______)
                                                                 _______)
                                                        ---.__________)

                                                       3 - Tesoura 

                                                           _______
                                                        ---'   ____)____
                                                                  ______)
                                                               __________)
                                                              (____)
                                                        ---.__(___)

                                                       """);

                                    Integer maoJogador2=leia.nextInt();
                                    if(maoJogador1==0||maoJogador2==0){
                                        sairdaqui=true;
                                    }else if(maoJogador1<0||maoJogador1>3||maoJogador2<0||maoJogador2>3){
                                        System.out.println(" Um de vocês deverá digitar um número válido,\n"
                                                        + " lembre-se 1,2 ou 3 para as respectivas opções!");
                                    }else{
                                        String[] maoplayer1=rafa.maoJokempo(maoJogador1);
                                        String[] maoplayer2=rafa.maoJokempo(maoJogador2);
                                        System.out.println("Jogador 1 Você jogou:");
                                        System.out.println(maoplayer1[0]);
                                        System.out.println("\nX\n");
                                        System.out.println("Jogador 2 Você jogou:");
                                        System.out.println(maoplayer2[0]); 
                                        String frasedoganhador= rafa.quemGanha(maoplayer1, maoplayer2);
                                        System.out.println(frasedoganhador);
                                        Integer selecao1=Integer.valueOf(maoplayer1[1]);
                                        Integer selecao2=Integer.valueOf(maoplayer2[1]);
                                        Integer[] pontuacaoacumuladora = rafa.pontuacaoAcumuladora(selecao1, selecao2);
                                        pontuacaomulti1+=pontuacaoacumuladora[0];
                                        pontuacaomulti2+=pontuacaoacumuladora[1];
                                        System.out.println(String.format("Pontuação atual: \n"
                                                + "Jogador 1 = %d",pontuacaomulti1));
                                        System.out.println(String.format("\nMaquina = %d",pontuacaomulti2));
                                    }
                                
                                }while (sairdaqui==false);
                                
                                //Método para jogar com alguém
                            }else if(seleJokemp==3){
                                System.out.println("Saindo do Jogo");
                                sairJokempo=true;
                                
                            }
                            
                        } while (sairJokempo==false);
                    break;
                case 5:
                    sair=true;
                    break;
                default:
                System.out.println("Dia inválido!");
            }
        }while(!sair);
    }
}
