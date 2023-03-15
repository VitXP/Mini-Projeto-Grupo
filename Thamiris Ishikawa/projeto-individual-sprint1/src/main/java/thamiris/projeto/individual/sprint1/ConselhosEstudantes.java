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
public class ConselhosEstudantes {

    // Método que faz sorteio de um conselho para o usuário
    String retornarConselhoEstudante() {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 8);
        
        String conselhoEstudante = "";
        
        switch (numeroAleatorio) {
            case 1:
                conselhoEstudante = "Lembre-se de seguir em frente mesmo quando estiver difícil";
                break;

            case 2:
                conselhoEstudante = "Faltas são um direito, porém use-as somente quando necessário!";
                break;

            case 3:
                conselhoEstudante = "Ter um bom planejamento é essencial para ter sucesso nos estudos!";
                break;

            case 4:
                conselhoEstudante = "Não tenha medo de experimentar coisas novas!";
                break;

            case 5:
                conselhoEstudante = "Sempre tire todas as dúvidas com o professor!";
                break;

            case 6:
                conselhoEstudante = "Respeite o seu processo de aprendizado, não se compare aos demais!";
                break;

            case 7:
                conselhoEstudante = "Seja flexível a mudanças e esteja sempre disposto a aprender coisas novas!";
                break;

            case 8:
                conselhoEstudante = "Aproveite cada momento e faça o seu melhor!";
                break;

           
        }
        return conselhoEstudante;
    }
}
