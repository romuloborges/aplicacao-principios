package br.ufes.ocp.correto.principal;

import br.ufes.ocp.correto.operador.SomaOperador;
import br.ufes.ocp.correto.operador.SubtracaoOperador;
import br.ufes.ocp.correto.operador.MultiplicacaoOperador;
import br.ufes.ocp.correto.operador.DivisaoOperador;
import br.ufes.ocp.correto.model.Expressao;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Expressao ex = new Expressao(5, 2, new SomaOperador());
        
        System.out.println(ex.calcula());
        
        ex.setOperador(new SubtracaoOperador());
        
        System.out.println(ex.calcula());
        
        ex.setOperador(new MultiplicacaoOperador());
        
        System.out.println(ex.calcula());
        
        ex.setOperador(new DivisaoOperador());
        
        System.out.println(ex.calcula());
        
    }
    
}
