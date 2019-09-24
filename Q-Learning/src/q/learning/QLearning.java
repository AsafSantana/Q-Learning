/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q.learning;

/**
 *
 * @author asafb
 */
public class QLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //Onde estiver 3 eh obstaculo
        
        int[][] ambiente = new int[40][40];
               

        Posicao posicaoAtual = new Posicao(0, 0);
        Posicao posicaoFinal = new Posicao(32, 13);

        double[][] matrizDeEstados = new double[8][4];

        int[][] matrizDeMovimento = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!posicaoAtual.equals(posicaoFinal)) {
        
            
            
            
            
        }

    }
    
  
}
