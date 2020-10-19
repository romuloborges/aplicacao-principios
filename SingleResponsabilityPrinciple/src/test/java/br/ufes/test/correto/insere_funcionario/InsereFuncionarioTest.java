package br.ufes.test.correto.insere_funcionario;

import br.ufes.srp.correto.model.Cargo;
import br.ufes.srp.correto.model.Departamento;
import br.ufes.srp.correto.model.Funcionario;
import br.ufes.srp.correto.collection.FuncionarioCollection;
import br.ufes.srp.correto.insere_funcionario.InsereFuncionario;
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
        
        insereFuncionario.executa(new Funcionario("João", "951.753.852-12", new Cargo("Programador", 40), new Departamento(4, "Programação")));
        
        assertEquals(quantidadeEsperada, FuncionarioCollection.getInstancia().getFuncionarios().size());
    }
    
}
