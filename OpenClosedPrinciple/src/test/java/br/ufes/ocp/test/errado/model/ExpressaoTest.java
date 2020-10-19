package br.ufes.ocp.test.errado.model;

import br.ufes.ocp.errado.model.Expressao;
import br.ufes.ocp.errado.model.Operador;
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
public class ExpressaoTest {
    
    public ExpressaoTest() {
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

    // Testando o cálculo da expressão para o operador de soma
    @Test
    public void CT001() {
        Expressao ex = new Expressao(8, 11, Operador.SOMA);
        
        double resultadoEsperado = 19;
        
        assertEquals(resultadoEsperado, ex.calcula(), 0.1);
    }
    
    // Testando o cálculo da expressão para o operador de subtração
    @Test
    public void CT002() {
        Expressao ex = new Expressao(8, 11, Operador.SUBTRACAO);
        
        double resultadoEsperado = -3;
        
        assertEquals(resultadoEsperado, ex.calcula(), 0.1);
    }
    
    // Testando o cálculo da expressão para o operador de multiplicação
    @Test
    public void CT003() {
        Expressao ex = new Expressao(20, 8, Operador.MULTIPLICACAO);
        
        double resultadoEsperado = 160;
        
        assertEquals(resultadoEsperado, ex.calcula(), 0.1);
    }
    
    // Testando o cálculo da expressão para o operador de divisão
    @Test
    public void CT004() {
        Expressao ex = new Expressao(20, 8, Operador.DIVISAO);
        
        double resultadoEsperado = 2.5;
        
        assertEquals(resultadoEsperado, ex.calcula(), 0.1);
    }
    
}
