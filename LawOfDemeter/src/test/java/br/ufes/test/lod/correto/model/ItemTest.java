package br.ufes.test.lod.correto.model;

import br.ufes.lod.correto.model.Produto;
import br.ufes.lod.correto.model.Item;
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
public class ItemTest {
    
    public ItemTest() {
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

    // Testando o método calculaValor do Item
    @Test
    public void CT001() {
        Item item = new Item(10, new Produto("Água mineral", 2.5));
        
        double valorEsperado = 25;
        
        assertEquals(valorEsperado, item.calculaValor(), 0.1);
    }
    
}
