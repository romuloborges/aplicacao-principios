package br.ufes.lsp.errado.principal;

import br.ufes.lsp.errado.collection.CriaturaCollection;
import br.ufes.lsp.errado.model.Inimigo;
import br.ufes.lsp.errado.model.Jogador;
import br.ufes.lsp.errado.model.Criatura;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        double qtdParaMoverEmX = 40;
        double qtdParaMoverEmY = 40;
        
        for(Criatura criatura : CriaturaCollection.getInstancia().getCriaturas()) {
            if (criatura instanceof Jogador) {
                ((Jogador) criatura).moverJogador(qtdParaMoverEmX, qtdParaMoverEmY);
            } else if (criatura instanceof Inimigo) {
                ((Inimigo) criatura).moverInimigo(qtdParaMoverEmX, qtdParaMoverEmY);
            }
        }
    }
    
}
