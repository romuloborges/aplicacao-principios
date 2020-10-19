package br.ufes.lod.errado.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rborges
 */
public class Carrinho {
    
    private String nomeCliente;
    protected final ArrayList<Item> itens = new ArrayList<>();

    public Carrinho(String nomeCliente) {
        setNomeCliente(nomeCliente);
    }
    
    public void adicionaItem(Produto produto, double quantidade) {
        if (produto == null) {
            throw new RuntimeException("Produto fornecido é inválido");
        }
        
        if (this.getItemPorNome(produto.getNome()) != null) {
            throw new RuntimeException("Este produto já existe!");
        }
        
        itens.add(new Item(quantidade, produto));
    }
    
    public double calculaValorTotal() {
        double total = 0;
        
        for(Item item : itens) {
            total += item.getProduto().getValorUnitario() * item.getQuantidade();
        }
        
        return total;
    }
    
    public Item getItemPorNome(String nomeProduto) {
        for (Item item : itens) {
            if (item.getProduto().getNome().toLowerCase().equals(nomeProduto.toLowerCase())) {
                return item;
            }
        }
        
        return null;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) {
            throw new RuntimeException("Nome do cliente é inválido");
        }
        
        this.nomeCliente = nomeCliente;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
    
}
