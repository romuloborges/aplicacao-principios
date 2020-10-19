package br.ufes.isp.correto.model;

/**
 *
 * @author rborges
 */
public class LivroAutor {
    
    private Livro livro;
    private Autor autor;

    public LivroAutor(Livro livro, Autor autor) {
        if (livro == null) {
            throw new RuntimeException("Livro inválido");
        }
        
        if (autor == null) {
            throw new RuntimeException("Autor inválido");
        }
        
        this.livro = livro;
        this.autor = autor;
    }

    public Livro getLivro() {
        return livro;
    }

    public Autor getAutor() {
        return autor;
    }
    
}
