package br.ufes.dip.errado.repository;

import br.ufes.dip.errado.model.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rborges
 */
public class PessoaRepository {
    
    private final List<Pessoa> pessoas;
    
    public PessoaRepository() {
        this.pessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new RuntimeException("Pessoa inválida para inserção");
        }
        
        this.pessoas.add(pessoa);
    }
    
    public List<Pessoa> getAll() {
        return Collections.unmodifiableList(pessoas);
    }
    
}
