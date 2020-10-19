package br.ufes.lod.correto.model;

/**
 *
 * @author rborges
 */
public class Produto {
    
    private String nome;
    private double valorUnitario;

    public Produto(String nome, double valorUnitario) {
        setNome(nome);
        setValorUnitario(valorUnitario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome do produto é inválido");
        }
        
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
