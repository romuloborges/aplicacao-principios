package br.ufes.crp.errado.model;

/**
 *
 * @author rborges
 */
public class ResponsavelFinanceiro extends Pessoa {
    
    private String telefone;
    private String email;

    public ResponsavelFinanceiro(String nome, String nomeSocial, String cpf, String rg, String telefone, String email) {
        super(nome, nomeSocial, cpf, rg);
        setTelefone(telefone);
        setEmail(email);
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
