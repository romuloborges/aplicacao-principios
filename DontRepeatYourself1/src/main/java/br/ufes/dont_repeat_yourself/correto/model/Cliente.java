package br.ufes.dont_repeat_yourself.correto.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Cliente {
    
    private LocalDate dataCadastro;
    private double xp;
    private Pessoa pessoa;

    public Cliente(LocalDate dataCadastro, double xp, Pessoa pessoa) {
        if (dataCadastro == null || dataCadastro.isAfter(LocalDate.now())) {
            throw new RuntimeException("Pessoa fornecida não é válida");
        }
        
        if (pessoa == null) {
            throw new RuntimeException("Pessoa fornecida não é válida");
        }
        
        if (xp < 0) {
            throw new RuntimeException("XP fornecida não é válida");
        }
        
        
        this.dataCadastro = dataCadastro;
        this.pessoa = pessoa;
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public double getXp() {
        return xp;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
}
