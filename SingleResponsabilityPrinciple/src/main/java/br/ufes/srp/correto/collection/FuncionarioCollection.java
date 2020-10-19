package br.ufes.srp.correto.collection;

import br.ufes.srp.correto.model.Departamento;
import br.ufes.srp.correto.model.Funcionario;
import br.ufes.srp.correto.model.Cargo;
import java.util.ArrayList;
import java.util.Collections;
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
        funcionarios.add(new br.ufes.srp.correto.model.Funcionario("João", "123.456.789-00", new Cargo("Programador", 40), new Departamento(1, "Programação")));
        funcionarios.add(new br.ufes.srp.correto.model.Funcionario("Joana", "987.654.321-00", new Cargo("Contadora", 40), new Departamento(2, "Financeiro")));
    }
    
    public void inserir(Funcionario funcionario) {
        if (funcionario == null) {
            throw new RuntimeException("Funcionário fornecido é inválido");
        }
        
        funcionarios.add(funcionario);
    }
    
    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }
    
}
