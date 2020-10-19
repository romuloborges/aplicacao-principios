package br.ufes.srp.correto.model;

/**
 *
 * @author rborges
 */
public class Funcionario {
    
    private String nome;
    private final String cpf;
    private Cargo cargo;
    private Departamento departamento;

    public Funcionario(String nome, String cpf, Cargo cargo, Departamento departamento) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF fornecido é inválido");
        }
        
        this.cpf = cpf;
        setNome(nome);
        setCargo(cargo);
        setDepartamento(departamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome informado para o funcionário não é válido");
        }
        
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        if (cargo == null) {
            throw new RuntimeException("Cargo informado para o funcionário não é válido");
        }
        
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        if (departamento == null) {
            throw new RuntimeException("Departamento informado para o funcionário não é válido");
        }
        
        this.departamento = departamento;
    }
    
}
