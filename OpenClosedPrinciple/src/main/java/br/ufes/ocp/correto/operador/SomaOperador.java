package br.ufes.ocp.correto.operador;

import br.ufes.ocp.correto.model.Expressao;

/**
 *
 * @author rborges
 */
public class SomaOperador implements IOperador {

    @Override
    public double aplica(Expressao expressao) {
        if (expressao == null) {
            throw new RuntimeException("Expressão informada é inválida");
        }
        
        return expressao.getTermo1() + expressao.getTermo2();
    }
    
}
