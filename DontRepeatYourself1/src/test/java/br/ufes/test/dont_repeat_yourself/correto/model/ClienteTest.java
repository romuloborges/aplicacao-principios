package br.ufes.test.dont_repeat_yourself.correto.model;

import br.ufes.dont_repeat_yourself.correto.model.Cliente;
import br.ufes.dont_repeat_yourself.correto.model.Pessoa;
import java.time.LocalDate;
import java.time.Month;
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
public class ClienteTest {
    
    public ClienteTest() {
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

    // Testando o método incrementarXP
    @Test
    public void CT001() {
        Cliente c = new Cliente(LocalDate.now(), 0, new Pessoa("Joana", "987.654.321-11", "987654321", LocalDate.of(1995, Month.JANUARY, 10)));
        
        c.incrementarXP(20);
        
        double xpEsperada = 20;
        
        assertEquals(xpEsperada, c.getXp(), 0.1);
    }
    
    // Testando o método decrementarXP
    @Test
    public void CT002() {
        Cliente c = new Cliente(LocalDate.now(), 50, new Pessoa("Joana", "987.654.321-11", "987654321", LocalDate.of(1995, Month.JANUARY, 10)));
        
        c.decrementarXP(20);
        
        double xpEsperada = 30;
        
        assertEquals(xpEsperada, c.getXp(), 0.1);
        
    }
    
}
