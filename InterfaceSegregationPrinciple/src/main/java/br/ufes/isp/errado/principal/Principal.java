package br.ufes.isp.errado.principal;

import br.ufes.isp.errado.publica_livro.PublicaLivroFisico;
import br.ufes.isp.errado.publica_livro.PublicaLivroDigital;
import br.ufes.isp.errado.model.Autor;
import br.ufes.isp.errado.model.Livro;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Livro livro = new Livro("Livro novo", LocalDate.now(), "951-45-1234-123-0", "Nova", Arrays.asList(new Autor("Autor 1", LocalDate.now())));
        
        PublicaLivroFisico plf = new PublicaLivroFisico();
        plf.enviaParaGrafica(livro);
        
        PublicaLivroDigital pld = new PublicaLivroDigital();
        pld.disponibilizaUrl(livro);
        
    }
    
}
