package br.ufes.test.errado.insere_funcionario;

import br.ufes.srp.errado.model.Funcionario;
import br.ufes.srp.errado.collection.FuncionarioCollection;
import br.ufes.srp.errado.insere_funcionario.InsereFuncionario;
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
public class InsereFuncionarioTest {
    
    public InsereFuncionarioTest() {
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
        InsereFuncionario insereFuncionario = new InsereFuncionario();
        
        int quantidadeEsperada = FuncionarioCollection.getInstancia().getFuncionarios().size() + 1;
        
        insereFuncionario.executa(new Funcionario("João", "951.753.852-12", "Programador", 40, 4, "Programação"));
        
        assertEquals(quantidadeEsperada, FuncionarioCollection.getInstancia().getFuncionarios().size());
    }
    
}
