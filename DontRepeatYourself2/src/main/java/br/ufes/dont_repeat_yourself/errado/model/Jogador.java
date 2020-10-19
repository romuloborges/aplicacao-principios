package br.ufes.dont_repeat_yourself.errado.model;

import br.ufes.dont_repeat_yourself.errado.bonus.IBonus;
import java.util.List;

/**
 *
 * @author rborges
 */
public class Jogador extends Funcionario {
    
    private Integer golsMarcados;
    private Integer partidasGanhas;

    public Jogador(Integer golsMarcados, Integer partidasGanhas, Cargo cargo, double salario, Pessoa pessoa, double distancia, double horasExtras, List<IBonus> listaBonus) {
        super(cargo, salario, pessoa, distancia, horasExtras, listaBonus);
        this.golsMarcados = golsMarcados;
        this.partidasGanhas = partidasGanhas;
    }
    
    // Método repetido
    public double calculaValorBonus() {
        double valorBonus = 0;
        List<IBonus> listaBonus = getListaBonus();
        
        if (listaBonus != null && !listaBonus.isEmpty()) {
            for(IBonus bonus : listaBonus) {
                valorBonus += bonus.calcula(this);
            }
        }
        
        return valorBonus;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }
    
    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public Integer getPartidasGanhas() {
        return partidasGanhas;
    }

    public void setPartidasGanhas(Integer partidasGanhas) {
        this.partidasGanhas = partidasGanhas;
    }
    
}
