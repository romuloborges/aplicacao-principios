package br.ufes.test.dont_repeat_yourself.correto.bonus;

import br.ufes.dont_repeat_yourself.correto.bonus.BonusPorDistancia;
import br.ufes.dont_repeat_yourself.correto.bonus.BonusPorHoraExtra;
import br.ufes.dont_repeat_yourself.correto.model.Cargo;
import br.ufes.dont_repeat_yourself.correto.model.Jogador;
import br.ufes.dont_repeat_yourself.correto.model.Pessoa;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
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
public class BonusPorDistanciaTest {
    
    public BonusPorDistanciaTest() {
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

    @Test
    public void CT001() {
        BonusPorDistancia bpd = new BonusPorDistancia();
        
        double bonusEsperado = 2500;
        
        assertEquals(bonusEsperado, bpd.calcula(new Jogador(5, 3, new Cargo("Jogador", 40), 2000, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)), 100, 2, Arrays.asList(new BonusPorDistancia(), new BonusPorHoraExtra()))), 0.1);
    }
    
}
