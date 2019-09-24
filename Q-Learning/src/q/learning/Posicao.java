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
public class Posicao {
    
    int posicao_linha;
    int posicao_coluna;

   
    
    public Posicao(int posicao_linha, int posicao_coluna) {
        this.posicao_linha = posicao_linha;
        this.posicao_coluna = posicao_coluna;
    }

    
    public int getPosicao_linha() {
        return posicao_linha;
    }

    public void setPosicao_linha(int posicao_linha) {
        this.posicao_linha = posicao_linha;
    }

    public int getPosicao_coluna() {
        return posicao_coluna;
    }

    public void setPosicao_coluna(int posicao_coluna) {
        this.posicao_coluna = posicao_coluna;
    }

    @Override
    public boolean equals(Object obj) {
        Posicao p = (Posicao) obj;
        if (this.posicao_coluna == p.posicao_coluna && this.posicao_linha == p.posicao_linha)
            return true;
        return false;
    }
  
     
}
