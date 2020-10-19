package br.ufes.dont_repeat_yourself.errado.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Funcionario {
    
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private String cargo;
    private Integer cargaHorariaSemanal;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, LocalDate dataNascimento, String cargo, Integer cargaHorariaSemanal, double salario) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF informado não é válido");
        }
        
        if (rg == null || rg.isBlank()) {
            throw new RuntimeException("RG informado não é válido");
        }
        
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data de nascimento informada não é válida");
        }
        
        if (salario <= 0) {
            throw new RuntimeException("Salário fornecido não é válido");
        }
        
        setNome(nome);
        setCargo(cargo);
        setCargaHorariaSemanal(cargaHorariaSemanal);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    public void aumentarSalario(double valorAumentar) {
        if (valorAumentar < 0) {
            
        }
        
        this.salario += valorAumentar;
    }
    
    public void diminuirSalario(double valorDiminuir) {
        this.salario -= Math.abs(valorDiminuir);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome informado não é válido");
        }
        
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            throw new RuntimeException("Cargo informado não é válido");
        }
        
        this.cargo = cargo;
    }

    public Integer getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
        if (cargaHorariaSemanal <= 0) {
            throw new RuntimeException("Carga horária informada não é válida");
        }
        
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public double getSalario() {
        return salario;
    }
    
}
