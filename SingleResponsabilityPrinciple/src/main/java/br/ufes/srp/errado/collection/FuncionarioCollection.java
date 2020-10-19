package br.ufes.srp.errado.collection;

import br.ufes.srp.errado.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rborges
 */
public class FuncionarioCollection {
    
    private final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static FuncionarioCollection instancia;
    
    public static FuncionarioCollection getInstancia() {
        if (instancia == null) {
            instancia = new FuncionarioCollection();
        }
        
        return instancia;
    }
    
    private FuncionarioCollection() {
        funcionarios.add(new Funcionario("João", "123.456.789-00", "Programador", 40, 1, "Programação"));
        funcionarios.add(new Funcionario("Joana", "987.654.321-00", "Contadora", 40, 2, "Financeiro"));
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
}
