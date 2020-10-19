package br.ufes.ocp.correto.model;

import br.ufes.ocp.correto.operador.IOperador;

/**
 *
 * @author rborges
 */
public class Expressao {
    
    private double termo1;
    private double termo2;
    private IOperador operador;

    public Expressao(double termo1, double termo2, IOperador operador) {
        setTermo1(termo1);
        setTermo2(termo2);
        setOperador(operador);
    }
    
    public double calcula() {
        return operador.aplica(this);
    }

    public double getTermo1() {
        return termo1;
    }

    public void setTermo1(double termo1) {
        this.termo1 = termo1;
    }

    public double getTermo2() {
        return termo2;
    }

    public void setTermo2(double termo2) {
        this.termo2 = termo2;
    }

    public IOperador getOperador() {
        return operador;
    }

    public void setOperador(IOperador operador) {
        if (operador == null) {
            throw new RuntimeException("Operador informado é inválido");
        }
        
        this.operador = operador;
    }
    
}
