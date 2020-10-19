package br.ufes.dont_repeat_yourself.correto.model;

/**
 *
 * @author rborges
 */
public class Funcionario {
    
    private Cargo cargo;
    private double salario;
    private Pessoa pessoa;

    public Funcionario(Cargo cargo, double salario, Pessoa pessoa) {
        if (salario <= 0) {
            throw new RuntimeException("Salário fornecido não é válido");
        }
        
        if (pessoa == null) {
            throw new RuntimeException("Pessoa fornecida não é válida");
        }
        
        setCargo(cargo);
        this.salario = salario;
        this.pessoa = pessoa;
    }
    
    public void aumentarSalario(double valorAumentar) {
        if (valorAumentar < 0) {
            
        }
        
        this.salario += valorAumentar;
    }
    
    public void diminuirSalario(double valorDiminuir) {
        this.salario -= Math.abs(valorDiminuir);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        if (cargo == null) {
            throw new RuntimeException("Cargo fornecido é inválido");
        }
        
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
}
