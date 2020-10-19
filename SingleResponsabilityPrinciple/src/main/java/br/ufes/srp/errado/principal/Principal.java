package br.ufes.srp.errado.principal;

import br.ufes.srp.errado.insere_funcionario.InsereFuncionario;
import br.ufes.srp.errado.model.Funcionario;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        InsereFuncionario insereFuncionario = new InsereFuncionario();
        
        insereFuncionario.executa(new Funcionario("Maria", "457.654.321-00", "Contadora", 40, 2, "Financeiro"));
    }
    
}
