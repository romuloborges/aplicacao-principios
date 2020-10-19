package br.ufes.dont_repeat_yourself.errado.bonus;

import br.ufes.dont_repeat_yourself.errado.model.Funcionario;

/**
 *
 * @author rborges
 */
public class BonusPorHoraExtra implements IBonus {
    
    private final double valorHoraExtra = 50;

    @Override
    public double calcula(Funcionario funcionario) {
        return funcionario.getHorasExtras() * valorHoraExtra;
    }
    
}
