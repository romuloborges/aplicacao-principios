package br.ufes.dont_repeat_yourself.correto.model;

import br.ufes.dont_repeat_yourself.correto.bonus.IBonus;
import java.util.List;

/**
 *
 * @author rborges
 */
public class Tecnico extends Funcionario {
    
    private Integer partidasGanhas;

    public Tecnico(Integer partidasGanhas, Cargo cargo, double salario, Pessoa pessoa, double distancia, double horasExtras, List<IBonus> listaBonus) {
        super(cargo, salario, pessoa, distancia, horasExtras, listaBonus);
        this.partidasGanhas = partidasGanhas;
    }

    public Integer getPartidasGanhas() {
        return partidasGanhas;
    }

    public void setPartidasGanhas(Integer partidasGanhas) {
        this.partidasGanhas = partidasGanhas;
    }
    
}
