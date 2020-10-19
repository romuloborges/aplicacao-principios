package br.ufes.test.lsp.correto.model;

import br.ufes.lsp.correto.model.Jogador;
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
public class JogadorTest {
    
    public JogadorTest() {
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
        Jogador jogador = new Jogador(50, 50, 64, 64, 100);
        
        jogador.setVelocidade(10);
        
        jogador.mover(40, 0);
        
        double posicaoXEsperada = 100;
        
        assertEquals(posicaoXEsperada, jogador.getPosicaoX(), 0.1);
    }
    
    // Testando o método de mover para movimentação no eixo Y
    @Test
    public void CT002() {
        Jogador jogador = new Jogador(50, 50, 64, 64, 100);
        
        jogador.setVelocidade(10);
        
        jogador.mover(0, 40);
        
        double posicaoYEsperada = 100;
        
        assertEquals(posicaoYEsperada, jogador.getPosicaoY(), 0.1);
    }
    
}
