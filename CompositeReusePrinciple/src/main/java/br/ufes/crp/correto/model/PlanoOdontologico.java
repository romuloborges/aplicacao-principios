package br.ufes.crp.correto.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rborges
 */
public class PlanoOdontologico {
    
    private LocalDate dataInicio;
    private double valorMensalidade;
    private ResponsavelFinanceiro responsavelFinanceiro;
    private List<Beneficiario> beneficiarios;

    public PlanoOdontologico(LocalDate dataInicio, double valorMensalidade, ResponsavelFinanceiro responsavelFinanceiro, List<Beneficiario> beneficiarios) {
        setDataInicio(dataInicio);
        setValorMensalidade(valorMensalidade);
        setResponsavelFinanceiro(responsavelFinanceiro);
        setBeneficiarios(beneficiarios);
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        if (dataInicio == null) {
            throw new RuntimeException("Data de início fornecida é inválida");
        }
        
        this.dataInicio = dataInicio;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        if (valorMensalidade <= 0) {
            throw new RuntimeException("Valor da mensalidade fornecido é inválido");
        }
        
        this.valorMensalidade = valorMensalidade;
    }

    public ResponsavelFinanceiro getResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    public void setResponsavelFinanceiro(ResponsavelFinanceiro responsavelFinanceiro) {
        if (responsavelFinanceiro == null) {
            throw new RuntimeException("Responsável financeiro fornecido é inválido");
        }
        
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    public List<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(List<Beneficiario> beneficiarios) {
        if (beneficiarios == null || beneficiarios.isEmpty()) {
            throw new RuntimeException("Lista de beneficiários fornecida é inválida");
        }
        
        this.beneficiarios = beneficiarios;
    }
    
}
