/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thamiris.projeto.individual.sprint1;

/**
 *
 * @author thami
 */
public class MensagemInicial {

    String mensagemInicial(String nomeDigitado) {
        String mensagemBoasVindas = String.format("Olá, %s! Escolha uma das opções abaixo: ", nomeDigitado);
        return mensagemBoasVindas;
    }

    String menuEscolhas() {
        String menuOpcoes = ("\nDigite o número correspondente a opção desejada:\n"
                + "1 - Cálculo de média das Avaliações Continuadas\n"
                + "2 - Cálculo de média Final do Semestre\n"
                + "3 - Conselhos dos professores e alunos SPTech\n"
                + "4 - Sair\n"
                + "5 – Quiz sobre as matérias do curso de ADS\n");
        return menuOpcoes;
    }

    void exibirLinha() {
        System.out.println("---------------------------------------------------------------");
    }

    void exibirOpcaoEscolhida(Integer opcaoEscolhida) {
        if (opcaoEscolhida == 1) {
            System.out.println("Opção escolhida: Cálculo de média das Avaliações Continuadas");
        } else if (opcaoEscolhida == 2) {
            System.out.println("Opção escolhida: Cálculo de média Final do Semestre");
        } else if (opcaoEscolhida == 3) {
            System.out.println("Opção escolhida: Conselhos dos estudantes SPTech");
        } else if (opcaoEscolhida == 5){
            System.out.println("Opção escolhida: Quiz sobre as matérias do curso de ADS");
        }

    }
    
    void mensagemInicioJogo(String nomeDigitado){
        String fraseInicioJogo = String.format("Olá, %s!"
                + "\nVamos descobrir se você está por dentro dos conteúdos das aulas!", nomeDigitado);
        System.out.println(fraseInicioJogo);
    }
    
    
}
