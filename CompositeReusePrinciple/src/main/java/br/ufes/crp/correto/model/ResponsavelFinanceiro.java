package br.ufes.crp.correto.model;

/**
 *
 * @author rborges
 */
public class ResponsavelFinanceiro {
    
    private String telefone;
    private String email;
    private final Pessoa pessoa;

    public ResponsavelFinanceiro(String telefone, String email, Pessoa pessoa) {
        if (pessoa == null) {
            throw new RuntimeException("Pessoa fornecida é inválida");
        }
        
        setTelefone(telefone);
        setEmail(email);
        this.pessoa = pessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new RuntimeException("Telefone fornecido é inválido");
        }
        
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new RuntimeException("E-mail fornecido é inválido");
        }
        
        this.email = email;
    }
    
}
