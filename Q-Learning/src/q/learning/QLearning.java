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
    
    double[][][] Q;
    
    int[][] matrizDeMovimento = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    double alfa = 0.25;
    double gamma = 0.9;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new QLearning().run();

    }
    
    public void run(){
        Posicao s = new Posicao(0, 0);
        Posicao posicaoFinal = new Posicao(32, 13);
        //s1 = s'
        Posicao s1 = new Posicao(0, 0);

        Q = new double[40][40][4];

        while (!s.equals(posicaoFinal)) {
        
            int a = escolheAcao(s, 1);
            
            s1.movePosicao(s, matrizDeMovimento[a]);
            int r = recompensa(s1);
            atualizaTabelaQ(s, a, s1, r);
            if (r!=-1){
                
                s.setPosicao(s1);
            }
        }
    }

    private int escolheAcao(Posicao posicaoAtual, int epsilon) {
        double[] vet = Q[posicaoAtual.getPosicao_linha()][posicaoAtual.getPosicao_coluna()];
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            
        }
        return maior;
    }

    private void atualizaTabelaQ(Posicao s, int a, Posicao s1, int r) {
        int a1 = escolheAcao(s1, 1);
        double maxQt = Q[s1.getPosicao_linha()][s1.getPosicao_coluna()][a1];
        double[] Qs = Q[s.getPosicao_linha()][s.getPosicao_coluna()];
        Qs[a] += alfa*(r+gamma*maxQt-Qs[a]);
    }
    
  
}
