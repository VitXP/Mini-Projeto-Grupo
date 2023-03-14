
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vmire
 */
public class ProjetoIndividual {
    public static void main(String[] args) {
        
          Scanner leitor = new Scanner (System.in);
        
        System.out.println("-----------------------------------");
        System.out.println("|            DanceMi              |");
        System.out.println("-----------------------------------");
        System.out.println("|        Digite seu Nome:         |");
        String nome = leitor.nextLine();
        
        Integer fim=0;
        Integer pontuacao = 0;
        Integer dancaEnergica = 0;
        Integer dancaCalma = 0;
        
       while(fim < 1){ 
        System.out.println("|Olá, "+nome+" o que deseja fazer:|");
        System.out.println("-----------------------------------");
        System.out.println("| 1 - Tempo de Dança              |");
        System.out.println("| 2 - Quiz                        |");
        System.out.println("| 3 - Calorias perdidas           |");
        System.out.println("| 0 - Sair                        |");
        
        Integer opcao = leitor.nextInt();
        
        if(opcao > 4 && opcao < 0) {
            System.out.println("Opção inválida");
        } else {
            
            switch(opcao){
            case 1:
                System.out.println("Digite o ano de Nascimento:");
                Integer anoNascimento = leitor.nextInt();
                System.out.println("Digite com quantos anos começou a dançar:");
                Integer anosDancados = leitor.nextInt();
                
                Integer calculoTempo = (2023 - anoNascimento) - anosDancados;
                
                if(calculoTempo > 4){
                    System.out.println("Você dança a bastante tempo,"
                            + " um total de " +calculoTempo+ " anos :)");
                }else{
                    System.out.println("Você ainda está no começo da jornada"
                            + "com um total de " +calculoTempo+ " anos");
                }
                break;
                
            case 2:
                System.out.println("Você prefere: 1- Músicas com Ritmo Forte "
                        + "ou 2- Músicas com Ritmo Lento");
                Integer opcao1 = leitor.nextInt();
                
                if(opcao1 == 1){
                   dancaEnergica += 1;
                } else{
                    dancaCalma += 1;
                }
                
                System.out.println("Você prefere: 1- Danças Livres "
                        + "ou 2- Danças Marcadas");
                Integer opcao2 = leitor.nextInt();
                
                if(opcao2 == 2){
                   dancaEnergica += 1;
                } else{
                    dancaCalma += 1;
                }
                
                System.out.println("Você prefere: 1- Danças desafiadoras e rápidas"
                        + "ou 2- Danças leves e descontraídas");
                Integer opcao3 = leitor.nextInt();
                
                if(opcao3 == 1){
                   dancaEnergica += 1;
                } else{
                    dancaCalma += 1;
                }
                
                System.out.println("Você prefere: 1- Just Dance "
                        + "ou 2- Dance Central");
                Integer opcao4 = leitor.nextInt();
                
                if(opcao4 == 2){
                   dancaEnergica += 1;
                } else{
                    dancaCalma += 1;
                }
                
                System.out.println("Você prefere: 1- Pop "
                        + "ou 2- Clássico");
                Integer opcao5 = leitor.nextInt();
                
                if(opcao5 == 1){
                   dancaEnergica += 1;
                } else{
                    dancaCalma += 1;
                }
                
                if(dancaEnergica > dancaCalma){
                    System.out.println("Resultado: Você prefere Ritmo Forte e "
                            + "Danças Desafiadoras");
                } else {
                    System.out.println("Resultado: Você prefere Ritmo Calmo e "
                            + "Danças Lentas");
                }  
                break;
                
                 
                
            case 0:
                fim++;
                break;
        }
        }
       }}}
    
