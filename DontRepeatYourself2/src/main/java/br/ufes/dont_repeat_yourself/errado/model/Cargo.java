package br.ufes.dont_repeat_yourself.errado.model;

/**
 *
 * @author rborges
 */
public class Cargo {
    
    private String nome;
    private Integer cargaHorariaSemanal;

    public Cargo(String nome, Integer cargaHorariaSemanal) {
        setNome(nome);
        setCargaHorariaSemanal(cargaHorariaSemanal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome informado para o cargo não é válido");
        }
        
        this.nome = nome;
    }

    public Integer getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
        if (cargaHorariaSemanal == null || cargaHorariaSemanal <= 0) {
            throw new RuntimeException("Valor informado para a carga horária semanal não é válido");
        }
        
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }
    
}
