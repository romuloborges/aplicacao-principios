package br.ufes.dip.correto.principal;

import br.ufes.dip.correto.model.Pessoa;
import br.ufes.dip.correto.repository.PessoaRepository;
import br.ufes.dip.correto.service.IPessoaService;
import br.ufes.dip.correto.service.PessoaService;
import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        IPessoaService ps = new PessoaService(new PessoaRepository());
        
        ps.adicionarPessoa(new Pessoa("João", "123.456.789-00", LocalDate.of(1990, 05, 18), "Rua João IV, Centro, Rio de Janeiro"));
    }
    
}
