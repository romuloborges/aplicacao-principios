package br.ufes.ocp.test.correto.model;

import br.ufes.ocp.correto.model.Expressao;
import br.ufes.ocp.correto.operador.SubtracaoOperador;
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
public class SubtracaoOperadorTest {
    
    public SubtracaoOperadorTest() {
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
        SubtracaoOperador so = new SubtracaoOperador();
        
        double resultadoEsperado = 5;
        
        assertEquals(resultadoEsperado, so.aplica(new Expressao(10, 5, so)), 0.1);
    }
    
}
