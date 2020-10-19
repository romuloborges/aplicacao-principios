package br.ufes.crp.errado.model;

/**
 *
 * @author rborges
 */
public class Pessoa {
    
    private String nome;
    private String nomeSocial;
    private final String cpf;
    private final String rg;

    public Pessoa(String nome, String nomeSocial, String cpf, String rg) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF fornecido é inválido");
        }
        
        if (rg == null || rg.isBlank()) {
            throw new RuntimeException("RG fornecido é inválido");
        }
        
        setNome(nome);
        setNomeSocial(nomeSocial);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome fornecido é inválido");
        }
        
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
    
}
