package br.ufes.isp.errado.publica_livro;

import br.ufes.isp.errado.model.Livro;

/**
 *
 * @author rborges
 */
public interface IPublicaLivro {
    
    public void enviaParaGrafica(Livro livro);
    public void disponibilizaUrl(Livro livro);
    
}
