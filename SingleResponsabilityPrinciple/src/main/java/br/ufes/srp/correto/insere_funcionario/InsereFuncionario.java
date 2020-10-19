package br.ufes.srp.correto.insere_funcionario;

import br.ufes.srp.correto.collection.FuncionarioCollection;
import br.ufes.srp.correto.model.Funcionario;

/**
 *
 * @author rborges
 */
public class InsereFuncionario {
    
    public void executa(Funcionario funcionario) {
        FuncionarioCollection.getInstancia().inserir(funcionario);
    }
    
}
