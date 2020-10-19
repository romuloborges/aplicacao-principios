package br.ufes.ocp.errado.model;

/**
 *
 * @author rborges
 */
public class Expressao {
    
    private double termo1;
    private double termo2;
    private Operador operador;

    public Expressao(double termo1, double termo2, Operador operador) {
        setTermo1(termo1);
        setTermo2(termo2);
        setOperador(operador);
    }
    
    public double calcula() {
        if (Operador.SOMA.equals(getOperador())) {
            return termo1 + termo2;
        } else if (Operador.SUBTRACAO.equals(getOperador())) {
            return termo1 - termo2;
        } else if (Operador.MULTIPLICACAO.equals(getOperador())) {
            return termo1 * termo2;
        } else if (Operador.DIVISAO.equals(getOperador())) {
            return termo1 / termo2;
        }
        
        return 0;
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

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        if (operador == null) {
            throw new RuntimeException("Operador informado é inválido");
        }
        
        this.operador = operador;
    }
    
}
