package br.ufes.isp.correto.publica_livro_fisico;

import br.ufes.isp.correto.model.Livro;

/**
 *
 * @author rborges
 */
public class PublicaLivroFisico implements IPublicaLivroFisico {

    @Override
    public void enviaParaGrafica(Livro livro) {
        if (livro == null) {
            throw new RuntimeException("Livro fornecido para publicação é inválido");
        }
        
        System.out.println("O livro " + livro.getTitulo() + " foi enviado para a gráfica");
    }
    
}
