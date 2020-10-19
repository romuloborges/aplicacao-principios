/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.test.lsp.errado.model;

import br.ufes.lsp.errado.model.Inimigo;
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
public class InimigoTest {
    
    public InimigoTest() {
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

    // Testando o método de mover para movimentação no eixo X
    @Test
    public void CT001() {
        Inimigo inimigo = new Inimigo(40, 50, 64, 64, 100);
        
        double posicaoXEsperada = 60;
        
        inimigo.moverInimigo(20, 0);
        
        assertEquals(posicaoXEsperada, inimigo.getPosicaoX(), 0.1);
        
    }
    
    // Testando o método de mover para movimentação no eixo Y
    @Test
    public void CT002() {
        Inimigo inimigo = new Inimigo(40, 50, 64, 64, 100);
        
        double posicaoYEsperada = 80;
        
        inimigo.moverInimigo(0, 30);
        
        assertEquals(posicaoYEsperada, inimigo.getPosicaoY(), 0.1);
        
    }
    
    // Testando o método de regeneração de vida
    @Test
    public void CT003() {
        Inimigo inimigo = new Inimigo(40, 50, 64, 64, 50);
        inimigo.setTaxaRegeneracaoVida(0.9);
        
        double vidaEsperada = 95;
        
        inimigo.regenerarVida();
        
        assertEquals(vidaEsperada, inimigo.getVida(), 0.1);
    }
    
}
