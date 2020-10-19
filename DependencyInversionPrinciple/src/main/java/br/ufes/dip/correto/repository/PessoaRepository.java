package br.ufes.dip.correto.repository;

import br.ufes.dip.correto.model.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rborges
 */
public class PessoaRepository implements IPessoaRepository {

    private final List<Pessoa> pessoas;
    
    public PessoaRepository() {
        this.pessoas = new ArrayList<>();
    }
    
    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new RuntimeException("Pessoa inválida para inserção");
        }
        
        this.pessoas.add(pessoa);
    }
    
    @Override
    public List<Pessoa> getAll() {
        return Collections.unmodifiableList(pessoas);
    }
    
}
