package br.ufes.lod.errado.principal;

import br.ufes.lod.errado.model.Carrinho;
import br.ufes.lod.errado.model.Produto;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), 3);
        carrinho.adicionaItem(new Produto("Barra de chocolate", 4), 5);
        
        System.out.println(carrinho.calculaValorTotal());
    }
    
}
