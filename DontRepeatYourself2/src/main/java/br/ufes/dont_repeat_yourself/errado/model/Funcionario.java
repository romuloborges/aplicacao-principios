package br.ufes.dont_repeat_yourself.errado.model;

import br.ufes.dont_repeat_yourself.errado.bonus.IBonus;
import java.util.List;

/**
 *
 * @author rborges
 */
public abstract class Funcionario {
    
    private Cargo cargo;
    private double salario;
    private final Pessoa pessoa;
    private double distancia;
    private double horasExtras; 
    private List<IBonus> listaBonus;

    public Funcionario(Cargo cargo, double salario, Pessoa pessoa, double distancia, double horasExtras, List<IBonus> listaBonus) {
        this.cargo = cargo;
        this.salario = salario;
        this.pessoa = pessoa;
        this.distancia = distancia;
        this.horasExtras = horasExtras;
        this.listaBonus = listaBonus;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public List<IBonus> getListaBonus() {
        return listaBonus;
    }

    public void setListaBonus(List<IBonus> listaBonus) {
        this.listaBonus = listaBonus;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    
}
