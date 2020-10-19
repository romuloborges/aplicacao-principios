package br.ufes.test.lod.errado.model;

import br.ufes.lod.errado.model.Carrinho;
import br.ufes.lod.errado.model.Produto;
import br.ufes.lod.errado.model.Item;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rborges
 */
public class CarrinhoTest {
    
    public CarrinhoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // Testando o método adicionaItem do Carrinho
    @Test
    public void CT001() {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), 3);
        carrinho.adicionaItem(new Produto("Barra de chocolate", 4), 5);
        
        int quantidadeItensEsperada = 2;
        
        assertEquals(quantidadeItensEsperada, carrinho.getItens().size());
    }
    
    // Testando o método adicionaItem do Carrinho para quantidade inválida
    @Test(expected = RuntimeException.class)
    public void CT002() {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), -3);
        carrinho.adicionaItem(new Produto("Barra de chocolate", 4), -5);
        
        int quantidadeItensEsperada = 0;
        
        assertEquals(quantidadeItensEsperada, carrinho.getItens().size());
    }
    
    // Testando o método adicionaItem do Carrinho para item repetido
    @Test(expected = RuntimeException.class)
    public void CT003() {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), 3);
        carrinho.adicionaItem(new Produto("Água mineral", 4), 5);
        
        int quantidadeItensEsperada = 1;
        
        assertEquals(quantidadeItensEsperada, carrinho.getItens().size());
    }
    
    // Testando o método calculaValorTotal do Carrinho
    @Test
    public void CT004() {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), 3);
        carrinho.adicionaItem(new Produto("Barra de chocolate", 4), 5);
        
        double valorEsperado = 27.5;
        
        assertEquals(valorEsperado, carrinho.calculaValorTotal(), 0.1);
    }
    
    // Testando o método getItemPorNome do Carrinho
    @Test
    public void CT005() {
        Carrinho carrinho = new Carrinho("João");
        
        carrinho.adicionaItem(new Produto("Água mineral", 2.5), 3);
        carrinho.adicionaItem(new Produto("Barra de chocolate", 4), 5);
        
        Item itemEsperado = carrinho.getItens().get(0);
        
        assertEquals(itemEsperado, carrinho.getItemPorNome("Água mineral"));
    }
    
}
