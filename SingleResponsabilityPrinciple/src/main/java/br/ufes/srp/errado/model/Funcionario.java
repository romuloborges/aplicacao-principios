package br.ufes.srp.errado.model;

/**
 *
 * @author rborges
 */
public class Funcionario {
    
    private String nome;
    private final String cpf;
    private String cargo;
    private Integer cargaHorariaCargo;
    private Integer codigoDepartamento;
    private String nomeDepartamento;

    public Funcionario(String nome, String cpf, String cargo, Integer cargaHorariaCargo, Integer codigoDepartamento, String nomeDepartamento) {
        if (cpf == null || cpf.isBlank()) {
            throw new RuntimeException("CPF fornecido é inválido");
        }
        
        this.cpf = cpf;
        setNome(nome);
        setCargo(cargo);
        setCargaHorariaCargo(cargaHorariaCargo);
        setCodigoDepartamento(codigoDepartamento);
        setNomeDepartamento(nomeDepartamento);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            throw new RuntimeException("Cargo informado não é válido");
        }
        
        this.cargo = cargo;
    }

    public Integer getCargaHorariaCargo() {
        return cargaHorariaCargo;
    }

    public void setCargaHorariaCargo(Integer cargaHorariaCargo) {
        if (cargaHorariaCargo == null || cargaHorariaCargo <= 0) {
            throw new RuntimeException("Valor informado para a carga horária não é válido");
        }
        
        this.cargaHorariaCargo = cargaHorariaCargo;
    }

    public Integer getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(Integer codigoDepartamento) {
        if (codigoDepartamento == null || codigoDepartamento <= 0) {
            throw new RuntimeException("Código informado para o departamento não é válido");
        }
        
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        if (nomeDepartamento == null || nomeDepartamento.isBlank()) {
            throw new RuntimeException("Nome informado para o departamento não é válido");
        }
        
        this.nomeDepartamento = nomeDepartamento;
    }
    
}
