/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rafael.projeto.individual.sprint1;

/**
 *
 * @author rafae
 */
public class MetodosRafa {
    
    //Métodos da solução da equação quadrática:
    
    Double valorDelta(Double valora,Double valorb,Double valorc){
        Double valorQuadradob=valorb*valorb;
        Double valorDelta=valorQuadradob-(4*valora*valorc);
        return valorDelta;
    }
    double[] resolucaoXDuasSaidas(Double valora,Double valorb,Double valorc){
        
        Double valorX1=((-1*valorb)+Math.sqrt(valorDelta(valora, valorb, valorc)))/2*valora;
        Double valorX2=((-1*valorb)-Math.sqrt(valorDelta(valora, valorb, valorc)))/2*valora;
        double[] valoresX = {valorX1,valorX2};
        return valoresX;
    }
    String calcularSolucoesQuadraticas(Double valora,Double valorb,Double valorc){
        if (valorDelta(valora,valorb,valorc)>0){
            double[] solucoes=resolucaoXDuasSaidas(valora,valorb,valorc);
            Double x1=solucoes[0];
            Double x2=solucoes[1];
            String resposta=String.format("A equação possuí duas soluções x1:%.2f e x2:%.2f",x1,x2);
            return resposta;
        }else if (valorDelta(valora,valorb,valorc)==0){
            double[] solucoes=resolucaoXDuasSaidas(valora,valorb,valorc);
            Double x1=solucoes[0];
            String resposta=(String.format("A equação possuí apenas uma solução sendo x = %.2f", x1));
            return resposta;
        }else if(valorDelta(valora,valorb,valorc)<0){
            String resposta=("Não existe solução real para a equação!!!");
            return resposta;
        }
        return null;
    }
    
    //Métodos do contador de piadas
    String contadorDePiadas(Integer selecao){
        String piada="";
        
        if (selecao==1){
            piada="PHP";
        }else if(selecao==2){
            piada="Existem 10 tipos de pessoas, as que entendem binário e as que não entendem.";
        }else if(selecao==3){
            piada="""
                  Qual doença se pode pegar ao usar notebook?
                      A LAPTOPspirose""";
        }else if(selecao<1&&selecao>3){
            piada="";
        }else if(selecao==4){
            piada="""
                  int x=10; int y=10; return x+y; // Qual o nome do filme?
                      O Código dá Vinte""";
        }else{
            piada="Você acabou de escolher um número Out of Range...";
        }
        
        
        return piada;
    }//Métodos do simulador de dividas
    
    
    Double jurosSimples(Double capitalInicial, Double taxaDeJuros, Double tempoAplicacao){
        
        Double jurosSimplesSimples=capitalInicial*taxaDeJuros*tempoAplicacao;
        return jurosSimplesSimples;
        
    }
    Double jurosCompostos(Double capitalInicial, Double taxaDeJuros, Double tempoAplicado){
        Double jurosCompostoComposto=capitalInicial*Math.pow((1+taxaDeJuros),tempoAplicado);
        return jurosCompostoComposto;
    }
    
    //Métodos do jogo Jokempo
    String[] maoJokempo(Integer escolha){
        String mao="";
        Integer selecao=0;
        String txtselecao="";
        switch (escolha){
            case 1:
                mao="""
                        _______
                    ---'   ____)
                          (_____)
                          (_____)
                          (____)
                    ---.__(___)""";
                selecao=1;
                txtselecao=selecao.toString();
                
            break;
            case 2:
                mao="""
                         _______
                    ---'    ____)____
                               ______)
                              _______)
                             _______)
                    ---.__________)""";
                selecao=2;
                txtselecao=selecao.toString();
            break;
            case 3:
                mao="""
                        _______
                    ---'   ____)____
                              ______)
                           __________)
                          (____)
                    ---.__(___)""";
                selecao=3;
                txtselecao=selecao.toString();
                
            break;
        }
        String[] lista={mao,txtselecao};
        return lista;
    }
    String quemGanha(String[] lista1,String[] lista2){
        String fraseGanhadora="";
        Integer pontuacaoUm;
        Integer pontuacaoDois;
        Integer selecao1=Integer.valueOf(lista1[1]);
        Integer selecao2=Integer.valueOf(lista2[1]);
        if(selecao1==selecao2){
            fraseGanhadora="Empate, cada participante ganha 1 ponto!";
            pontuacaoUm=1;
            pontuacaoDois=1;
            
        }else if((selecao1==1&&selecao2==2)||(selecao1==2&&selecao2==3)||(selecao1==3&&selecao2==1)){
            fraseGanhadora="Você perdeu, seu adversário ganha 3 pontos!";
            pontuacaoUm=0;
            pontuacaoDois=3;
            
        }else if((selecao1==3&&selecao2==2)||(selecao1==2&&selecao2==1)||(selecao1==1&&selecao2==3)){
            fraseGanhadora="Você ganhou, merece 3 pontos!";
            pontuacaoUm=3;
            pontuacaoDois=0;
        }
        return fraseGanhadora;
        
    }
    Integer[] pontuacaoAcumuladora(Integer mao1,Integer mao2){
        Integer pontuacaoUm=0;
        Integer pontuacaoDois=0;
        
        if(mao1==mao2){
            
            pontuacaoUm=1;
            pontuacaoDois=1;
            
        }else if((mao1==1&&mao2==2)||(mao1==2&&mao2==3)||(mao1==3&&mao2==1)){
            
            pontuacaoUm=0;
            pontuacaoDois=3;
            
        }else if((mao1==3&&mao2==2)||(mao1==2&&mao2==1)||(mao1==1&&mao2==3)){
            
            pontuacaoUm=3;
            pontuacaoDois=0;
        }
        Integer[] pontos={pontuacaoUm,pontuacaoDois};
        return pontos;
    }
    
}
