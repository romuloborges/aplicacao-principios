package br.ufes.lsp.correto.principal;

import br.ufes.lsp.correto.model.Criatura;
import br.ufes.lsp.correto.collection.CriaturaCollection;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        double qtdParaMoverEmX = 10;
        double qtdParaMoverEmY = 10;
        
        for(Criatura criatura : CriaturaCollection.getInstancia().getCriaturas()) {
            criatura.mover(qtdParaMoverEmX, qtdParaMoverEmY);
        }
    }
    
}
