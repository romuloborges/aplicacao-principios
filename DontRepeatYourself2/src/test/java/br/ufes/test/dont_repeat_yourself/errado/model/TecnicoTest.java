package br.ufes.test.dont_repeat_yourself.errado.model;

import br.ufes.dont_repeat_yourself.errado.bonus.BonusPorDistancia;
import br.ufes.dont_repeat_yourself.errado.bonus.BonusPorHoraExtra;
import br.ufes.dont_repeat_yourself.errado.model.Cargo;
import br.ufes.dont_repeat_yourself.errado.model.Pessoa;
import br.ufes.dont_repeat_yourself.errado.model.Tecnico;
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
public class TecnicoTest {
    
    public TecnicoTest() {
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
        Tecnico t = new Tecnico(5, new Cargo("Tecnico", 40), 1500, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)), 50, 5, Arrays.asList(new BonusPorDistancia(), new BonusPorHoraExtra()));
        
        double bonusEsperado = 1500;
        
        assertEquals(bonusEsperado, t.calculaValorBonus(), 0.1);
    }
    
}
