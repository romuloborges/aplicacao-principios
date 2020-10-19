package br.ufes.isp.correto.publica_livro_digital;

import br.ufes.isp.correto.model.Livro;

/**
 *
 * @author rborges
 */
public class PublicaLivroDigital implements IPublicaLivroDigital {

    @Override
    public void disponibilizaUrl(Livro livro) {
        if (livro == null) {
            throw new RuntimeException("Livro fornecido para publicação é inválido");
        }
        
        System.out.println("O livro " + livro.getTitulo() + " está disponível em: www.livropublicado.com.br");
    }
    
}
