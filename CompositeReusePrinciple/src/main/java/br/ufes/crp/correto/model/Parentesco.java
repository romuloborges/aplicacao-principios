package br.ufes.crp.correto.model;

/**
 *
 * @author rborges
 */
public enum Parentesco {
    
    TITULAR("Titular"), DEPENDENTE("Dependente");
    
    private Parentesco(String descricao) {
        this.descricao = descricao;
    }
    
    private final String descricao;
    
    public String getDescricao() {
        return descricao;
    }
    
}

