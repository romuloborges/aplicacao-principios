package br.ufes.srp.correto.model;

/**
 *
 * @author rborges
 */
public class Departamento {
    
    private Integer codigo;
    private String nome;

    public Departamento(Integer codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        if (codigo == null || codigo <= 0) {
            throw new RuntimeException("Código informado para o departamento não é válido");
        }
        
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome informado para o departamento não é válido");
        }
        
        this.nome = nome;
    }
    
}
