package br.ufes.dip.errado.principal;

import br.ufes.dip.errado.model.Pessoa;
import br.ufes.dip.errado.service.PessoaService;
import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        PessoaService ps = new PessoaService();
        
        ps.adicionarPessoa(new Pessoa("João", "123.456.789-00", LocalDate.of(1990, 05, 18), "Rua João IV, Centro, Rio de Janeiro"));
    }
    
}
