package br.ufes.dip.correto.service;

import br.ufes.dip.correto.model.Pessoa;
import br.ufes.dip.correto.repository.IPessoaRepository;

/**
 *
 * @author rborges
 */
public class PessoaService implements IPessoaService {

    private IPessoaRepository pr;
    
    public PessoaService(IPessoaRepository pr) {
        if (pr == null) {
            throw new RuntimeException("Forneça uma instância válida de PessoaRepository");
        }
        
        this.pr = pr;
    }
    
    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        pr.adicionarPessoa(pessoa);
        
        System.out.println("Pessoa adicionada com sucesso");
    }
    
}
