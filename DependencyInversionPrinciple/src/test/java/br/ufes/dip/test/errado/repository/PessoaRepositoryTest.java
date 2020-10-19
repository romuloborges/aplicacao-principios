package br.ufes.dip.test.errado.repository;

import br.ufes.dip.errado.model.Pessoa;
import br.ufes.dip.errado.repository.PessoaRepository;
import java.time.LocalDate;
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
public class PessoaRepositoryTest {
    
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
        PessoaRepository ps = new PessoaRepository();
        
        ps.adicionarPessoa(new Pessoa("João", "123.456.789-00", LocalDate.of(1990, 05, 18), "Rua João IV, Centro, Rio de Janeiro"));
        
        int quantidadeEsperada = 1;
        
        assertEquals(quantidadeEsperada, ps.getAll().size());
    }
    
}
