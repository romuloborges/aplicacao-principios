package br.ufes.ocp.errado.principal;

import br.ufes.ocp.errado.model.Expressao;
import br.ufes.ocp.errado.model.Operador;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Expressao ex = new Expressao(5, 4, Operador.SOMA);
        
        System.out.println(ex.calcula());
        
        ex.setOperador(Operador.SUBTRACAO);
        
        System.out.println(ex.calcula());
        
        ex.setOperador(Operador.MULTIPLICACAO);
        
        System.out.println(ex.calcula());
        
        ex.setOperador(Operador.DIVISAO);
        
        System.out.println(ex.calcula());
    }
    
}
