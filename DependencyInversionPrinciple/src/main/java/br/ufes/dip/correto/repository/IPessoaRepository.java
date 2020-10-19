package br.ufes.dip.correto.repository;

import br.ufes.dip.correto.model.Pessoa;
import java.util.List;

/**
 *
 * @author rborges
 */
public interface IPessoaRepository {
    
     public void adicionarPessoa(Pessoa pessoa);
     
     public List<Pessoa> getAll();
    
}
