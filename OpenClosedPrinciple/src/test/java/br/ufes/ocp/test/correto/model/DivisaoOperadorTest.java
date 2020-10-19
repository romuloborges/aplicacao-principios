package br.ufes.ocp.test.correto.model;

import br.ufes.ocp.correto.operador.DivisaoOperador;
import br.ufes.ocp.correto.model.Expressao;
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
public class DivisaoOperadorTest {
    
    public DivisaoOperadorTest() {
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
        DivisaoOperador dvo = new DivisaoOperador();
        
        double resultadoEsperado = 2;
        
        assertEquals(resultadoEsperado, dvo.aplica(new Expressao(10, 5, dvo)), 0.1);
    }
    
}
