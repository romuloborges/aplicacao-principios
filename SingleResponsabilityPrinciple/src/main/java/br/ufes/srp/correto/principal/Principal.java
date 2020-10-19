package br.ufes.srp.correto.principal;

import br.ufes.srp.correto.insere_funcionario.InsereFuncionario;
import br.ufes.srp.correto.model.Cargo;
import br.ufes.srp.correto.model.Departamento;
import br.ufes.srp.correto.model.Funcionario;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        InsereFuncionario insereFuncionario = new InsereFuncionario();
        
        insereFuncionario.executa(new Funcionario("Joaquim", "654.123.987-12", new Cargo("Gestor", 40), new Departamento(3, "Administração")));
    }
    
}
