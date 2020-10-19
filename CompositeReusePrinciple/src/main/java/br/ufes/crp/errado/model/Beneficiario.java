package br.ufes.crp.errado.model;

import java.time.LocalDate;

/**
 *
 * @author rborges
 */
public class Beneficiario extends Pessoa {
    
    private final LocalDate dataVigenciaInicio;
    private LocalDate dataVigenciaFim;
    private Parentesco parentesco;

    public Beneficiario(String nome, String nomeSocial, String cpf, String rg, LocalDate dataVigenciaInicio, Parentesco parentesco) {
        super(nome, nomeSocial, cpf, rg);
        
        if (dataVigenciaInicio == null) {
            throw new RuntimeException("Data de início da vigência é inválida");
        }
        
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
