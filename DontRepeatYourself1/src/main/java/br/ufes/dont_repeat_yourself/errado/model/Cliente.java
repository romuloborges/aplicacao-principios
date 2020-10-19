package br.ufes.dont_repeat_yourself.errado.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private double xp;

    public Cliente(String nome, String cpf, String rg, LocalDate dataNascimento, LocalDate dataCadastro, double xp) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF informado não é válido");
        }
        
        if (rg == null || rg.isBlank()) {
            throw new RuntimeException("RG informado não é válido");
        }
        
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data de nascimento informada não é válida");
        }
        
        if (dataCadastro == null || dataCadastro.isAfter(LocalDate.now())) {
            throw new RuntimeException("Pessoa fornecida não é válida");
        }
        
        if (xp < 0) {
            throw new RuntimeException("XP fornecida não é válida");
        }
        
        setNome(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.xp = xp;
    }
    
    public void incrementarXP(double xpParaIncrementar) {
        if (xpParaIncrementar < 0) {
            throw new RuntimeException("XP para incrementar é inválida");
        }
        
        this.xp += xpParaIncrementar;
    }
    
    public void decrementarXP(double xpParaDecrementar) {
        this.xp -= Math.abs(xpParaDecrementar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public double getXp() {
        return xp;
    }
    
}
