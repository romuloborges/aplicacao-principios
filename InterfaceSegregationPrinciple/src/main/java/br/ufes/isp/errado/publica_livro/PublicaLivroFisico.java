package br.ufes.isp.errado.publica_livro;

import br.ufes.isp.errado.model.Livro;

/**
 *
 * @author rborges
 */
public class PublicaLivroFisico implements IPublicaLivro {

    @Override
    public void enviaParaGrafica(Livro livro) {
        if (livro == null) {
            throw new RuntimeException("Livro fornecido para publicação é inválido");
        }
        
        System.out.println("O livro " + livro.getTitulo() + " foi enviado para a gráfica");
    }

    @Override
    public void disponibilizaUrl(Livro livro) {}
    
}
