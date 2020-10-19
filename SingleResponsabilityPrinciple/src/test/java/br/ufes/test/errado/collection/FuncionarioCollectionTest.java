package br.ufes.test.errado.collection;

import br.ufes.srp.errado.collection.FuncionarioCollection;
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
public class FuncionarioCollectionTest {
    
    public FuncionarioCollectionTest() {
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

    // Testa o método getFuncionarios
    @Test
    public void CT001() {
        assertNotNull(FuncionarioCollection.getInstancia().getFuncionarios());
    }
}
