package br.ufes.dont_repeat_yourself.errado.bonus;

import br.ufes.dont_repeat_yourself.errado.model.Funcionario;

/**
 *
 * @author rborges
 */
public class BonusPorDistancia implements IBonus {
    
    private final double valorDistancia = 25;

    @Override
    public double calcula(Funcionario funcionario) {
        return funcionario.getDistancia() * valorDistancia;
    }
    
}
