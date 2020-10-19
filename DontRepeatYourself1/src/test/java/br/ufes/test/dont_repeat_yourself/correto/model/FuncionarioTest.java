package br.ufes.test.dont_repeat_yourself.correto.model;

import br.ufes.dont_repeat_yourself.correto.model.Cargo;
import br.ufes.dont_repeat_yourself.correto.model.Funcionario;
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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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

    // Testando método aumentarSalario
    @Test
    public void CT001() {
        Funcionario f = new Funcionario(new Cargo("Gerente", 40), 2000, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)));
        
        f.aumentarSalario(100);
        
        double salarioEsperado = 2100;
        
        assertEquals(salarioEsperado, f.getSalario(), 0.1);
    }
    
    // Testando método diminuirSalario
    @Test
    public void CT002() {
        Funcionario f = new Funcionario(new Cargo("Gerente", 40), 2000, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)));
        
        f.diminuirSalario(200);
        
        double salarioEsperado = 1800;
        
        assertEquals(salarioEsperado, f.getSalario(), 0.1);
    }
    
}
