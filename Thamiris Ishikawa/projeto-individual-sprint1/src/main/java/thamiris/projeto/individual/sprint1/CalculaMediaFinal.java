/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thamiris.projeto.individual.sprint1;

/**
 *
 * @author thami
 */
public class CalculaMediaFinal {

    Double calcularMediaFinalSemestre(Double mediaAvaliacaoContinuada, Double notaProvaIntegrada) {
        Double resultadoFinal = (mediaAvaliacaoContinuada * 0.4) + (notaProvaIntegrada * 0.6);
        return resultadoFinal;
    }
    
    String retornarStatusDesempenho(Double mediaFinal) {
        String frase;
        Boolean altoDesempenho = false;

        if (mediaFinal >= 6) {
            altoDesempenho = true;
        }

        frase = altoDesempenho ? "Status de desempenho: ALTO" : "Status de desempenho: BAIXO";
        return frase;
    }

    String retornarAprovacao(Double mediaFinal, String nomeDigitado) {
        if (mediaFinal >= 6.0) {
            String resultadoAprovacao = String.format("Parabéns, %s! Você foi aprovado!", nomeDigitado);
            return resultadoAprovacao;
        } else {
            String resultadoAprovacao = String.format("Infelizmente %s, você não atingiu a média mínima.", nomeDigitado);
            return resultadoAprovacao;
        }
    }

    
}
