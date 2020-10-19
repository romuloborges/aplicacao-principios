package br.ufes.lod.errado.model;

/**
 *
 * @author rborges
 */
public class Item {
    
    private double quantidade;
    private Produto produto;

    public Item(double quantidade, Produto produto) {
        if (produto == null) {
            throw new RuntimeException("Produto fornecido é inválido");
        }
        
        setQuantidade(quantidade);
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade <= 0) {
            throw new RuntimeException("Quantidade fornecida é inválida");
        }
        
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    
}
