package br.ufes.dip.errado.service;

import br.ufes.dip.errado.model.Pessoa;
import br.ufes.dip.errado.repository.PessoaRepository;

/**
 *
 * @author rborges
 */
public class PessoaService {
    
    public void adicionarPessoa(Pessoa pessoa) {
        PessoaRepository pr = new PessoaRepository();
        
        pr.adicionarPessoa(pessoa);
        
        System.out.println("Pessoa adicionada com sucesso");
    }
    
}
