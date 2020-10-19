package br.ufes.ocp.errado.model;

/**
 *
 * @author rborges
 */
public enum Operador {
    
    SOMA("+"), SUBTRACAO("-"), MULTIPLICACAO("*"), DIVISAO("/");
    
    private Operador(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;
        
    public String getDescricao() {
        return descricao;
    }
    
}
