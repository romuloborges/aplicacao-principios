package br.ufes.isp.correto.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rborges
 */
public class Autor {
    
    private String nome;
    private LocalDate dataNascimento;
    private List<Livro> livros;
    
    public Autor(String nome, LocalDate dataNascimento) {
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome do livro é inválido");
        }
        
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null) {
            throw new RuntimeException("Data de nascimento fornecida é inválida");
        }
        
        this.dataNascimento = dataNascimento;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}
