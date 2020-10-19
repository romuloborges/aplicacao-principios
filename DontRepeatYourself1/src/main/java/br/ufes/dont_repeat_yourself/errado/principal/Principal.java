package br.ufes.dont_repeat_yourself.errado.principal;

import br.ufes.dont_repeat_yourself.errado.model.Cliente;
import br.ufes.dont_repeat_yourself.errado.model.Funcionario;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author rborges
 */
public class Principal {
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", "123.456.789-00", "123456789", LocalDate.of(1990, Month.MARCH, 20), "Gerente", 40, 2000);
        
        f.aumentarSalario(100);
        
        System.out.println(f.getSalario());
        
        Cliente c = new Cliente("Joana", "987.654.321-11", "987654321", LocalDate.of(1995, Month.JANUARY, 10), LocalDate.now(), 0);
        
        c.incrementarXP(20);
        
        System.out.println(c.getXp());
    }
    
}
