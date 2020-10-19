package br.ufes.dont_repeat_yourself.errado.principal;

import br.ufes.dont_repeat_yourself.errado.bonus.BonusPorDistancia;
import br.ufes.dont_repeat_yourself.errado.bonus.BonusPorHoraExtra;
import br.ufes.dont_repeat_yourself.errado.model.Cargo;
import br.ufes.dont_repeat_yourself.errado.model.Jogador;
import br.ufes.dont_repeat_yourself.errado.model.Pessoa;
import br.ufes.dont_repeat_yourself.errado.model.Tecnico;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Jogador j = new Jogador(5, 3, new Cargo("Jogador", 40), 2000, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)), 100, 2, Arrays.asList(new BonusPorDistancia(), new BonusPorHoraExtra()));
        
        System.out.println(j.calculaValorBonus());
        
        Tecnico t = new Tecnico(5, new Cargo("Tecnico", 40), 1500, new Pessoa("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20)), 50, 5, Arrays.asList(new BonusPorDistancia(), new BonusPorHoraExtra()));
        
        System.out.println(t.calculaValorBonus());
    }
    
}
