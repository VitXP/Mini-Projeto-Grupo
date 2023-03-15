package com.mycompany.projeto.individual;

public class Calculadora {
    
    
    String calcular(Integer operacao, Double numero01, Double numero02){
        String sinal = "";
        Double resultado = 0.0;
        
        switch(operacao){
            case 1:
                resultado = numero01 + numero02;
                sinal = "+";
                break;
                
            case 2:
                resultado = numero01 - numero02;
                sinal = "-";
                break;
                
            case 3:
                resultado = numero01 * numero02;
                sinal = "*";
                break;
                
            case 4:
                resultado = numero01 / numero02;
                sinal = "/";
                break;
            case 0:
                break;
                
            default:
                break;
        }
        return numero01 + " " + sinal + " " + numero02 + " = " + resultado;
    }
}
