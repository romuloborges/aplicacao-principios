package br.ufes.lsp.correto.collection;

import br.ufes.lsp.correto.model.Criatura;
import br.ufes.lsp.correto.model.Inimigo;
import br.ufes.lsp.correto.model.Jogador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rborges
 */
public class CriaturaCollection {
    
    private final ArrayList<Criatura> criaturas = new ArrayList<>();
    private static CriaturaCollection instancia;
    
    public static CriaturaCollection getInstancia() {
        if (instancia == null) {
            instancia = new CriaturaCollection();
        }
        
        return instancia;
    }
    
    private CriaturaCollection() {
        criaturas.add(new Jogador(10, 20, 64, 64, 100));
        criaturas.add(new Inimigo(50, 100, 64, 48, 100));
    }
    
    public List<Criatura> getCriaturas() {
        return Collections.unmodifiableList(criaturas);
    }
    
}
