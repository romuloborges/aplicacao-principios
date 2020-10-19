package br.ufes.isp.correto.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rborges
 */
public class Livro {
    
    private String titulo;
    private final LocalDate dataPublicacao;
    private String isbn;
    private String editora;
    private List<Autor> autores;
    
    public Livro(String titulo, LocalDate dataPublicacao, String isbn, String editora, List<Autor> autores) {
        if (autores == null || autores.isEmpty()) {
            throw new RuntimeException("Autores fornecidos são inválidos");
        }
         
        if (dataPublicacao == null) {
            throw new RuntimeException("Data de publicação fornecida não é válida");
        }
        
        setTitulo(titulo);
        setIsbn(isbn);
        setEditora(editora);
        this.dataPublicacao = dataPublicacao;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new RuntimeException("Título fornecido é inválido");
        }
        
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()) {
            throw new RuntimeException("ISBN fornecido é inválido");
        }
        
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        if (editora == null || editora.isBlank()) {
            throw new RuntimeException("Editora fornecida é inválida");
        }
        
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return Collections.unmodifiableList(autores);
    }
    
}
