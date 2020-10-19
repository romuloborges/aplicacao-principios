package br.ufes.srp.errado.insere_funcionario;

import br.ufes.srp.errado.collection.FuncionarioCollection;
import br.ufes.srp.errado.model.Funcionario;
import java.util.List;

/**
 *
 * @author rborges
 */
public class InsereFuncionario {
    
    public void executa(Funcionario funcionario) {
        if (funcionario == null) {
            throw new RuntimeException("Funcionário fornecido é inválido");
        }
        
        List<Funcionario> funcionarios = FuncionarioCollection.getInstancia().getFuncionarios();
        
        funcionarios.add(funcionario);
    }
    
}
