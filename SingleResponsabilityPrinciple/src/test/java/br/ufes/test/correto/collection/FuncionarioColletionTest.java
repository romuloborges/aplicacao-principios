package br.ufes.test.correto.collection;

import br.ufes.srp.correto.model.Cargo;
import br.ufes.srp.correto.model.Departamento;
import br.ufes.srp.correto.model.Funcionario;
import br.ufes.srp.correto.collection.FuncionarioCollection;
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
public class FuncionarioColletionTest {
    
    public FuncionarioColletionTest() {
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

    // Testa o método de inserir
    @Test
    public void CT001() {
        int quantidadeEsperada = FuncionarioCollection.getInstancia().getFuncionarios().size() + 1;
        
        FuncionarioCollection.getInstancia().inserir(new Funcionario("João", "951.753.852-12", new Cargo("Programador", 40), new Departamento(4, "Programação")));
        
        assertEquals(quantidadeEsperada, FuncionarioCollection.getInstancia().getFuncionarios().size());
    }
    
    // Testa o método getFuncionarios
    @Test
    public void CT002() {
        assertNotNull(FuncionarioCollection.getInstancia().getFuncionarios());
    }
    
}
