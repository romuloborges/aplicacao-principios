package br.ufes.dip.errado.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Pessoa {
    
    private final String nome;
    private final String cpf;
    private LocalDate dataNascimento;
    private String endereco;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
