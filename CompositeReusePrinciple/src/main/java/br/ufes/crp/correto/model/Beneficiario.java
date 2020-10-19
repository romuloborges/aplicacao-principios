package br.ufes.crp.correto.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Beneficiario {
    
    private final LocalDate dataVigenciaInicio;
    private LocalDate dataVigenciaFim;
    private Parentesco parentesco;
    private Pessoa pessoa;

    public Beneficiario(LocalDate dataVigenciaInicio, Parentesco parentesco, Pessoa pessoa) {
        if (pessoa == null) {
            throw new RuntimeException("Pessoa fornecida é inválida");
        }
        
        if (dataVigenciaInicio == null) {
            throw new RuntimeException("Data de início da vigência é inválida");
        }
        
        this.pessoa = pessoa;
        this.dataVigenciaInicio = dataVigenciaInicio;
        setParentesco(parentesco);
    }

    public LocalDate getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }

    public LocalDate getDataVigenciaFim() {
        return dataVigenciaFim;
    }

    public void setDataVigenciaFim(LocalDate dataVigenciaFim) {
        this.dataVigenciaFim = dataVigenciaFim;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        if (parentesco == null) {
            throw new RuntimeException("Parentesco fornecido é inválido");
        }
        
        this.parentesco = parentesco;
    }
    
}
