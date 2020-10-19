package br.ufes.isp.errado.publica_livro;

import br.ufes.isp.errado.model.Livro;

/**
 *
 * @author rborges
 */
public class PublicaLivroDigital implements IPublicaLivro  {

    @Override
    public void enviaParaGrafica(Livro livro) {}

    @Override
    public void disponibilizaUrl(Livro livro) {
        if (livro == null) {
            throw new RuntimeException("Livro fornecido para publicação é inválido");
        }
        
        System.out.println("O livro " + livro.getTitulo() + " está disponível em: www.livropublicado.com.br");
    }
    
}
