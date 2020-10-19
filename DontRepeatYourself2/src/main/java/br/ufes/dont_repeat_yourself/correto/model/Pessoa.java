package br.ufes.dont_repeat_yourself.correto.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String rg, LocalDate dataNascimento) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF informado não é válido");
        }
        
        if (rg == null || rg.isBlank()) {
            throw new RuntimeException("RG informado não é válido");
        }
        
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data de nascimento informada não é válida");
        }
        
        setNome(nome);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome informado não é válido");
        }
        
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
    
}
