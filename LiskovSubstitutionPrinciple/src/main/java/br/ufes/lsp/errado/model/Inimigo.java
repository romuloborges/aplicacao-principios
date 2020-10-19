package br.ufes.lsp.errado.model;

/**
 *
 * @author rborges
 */
public class Inimigo extends Criatura {
    
    private double taxaRegeneracaoVida;

    public Inimigo(double posicaoX, double posicaoY, double largura, double altura, double vida) {
        super(posicaoX, posicaoY, largura, altura, vida);
    }
    
    public void moverInimigo(double qtdEmX, double qtdEmY) {
        setPosicaoX(getPosicaoX() + qtdEmX);
        setPosicaoY(getPosicaoY() + qtdEmY);
    }
    
    public void regenerarVida() {
        setVida(getVida() + (getVida() * getTaxaRegeneracaoVida()));
    }

    public double getTaxaRegeneracaoVida() {
        return taxaRegeneracaoVida;
    }

    public void setTaxaRegeneracaoVida(double taxaRegeneracaoVida) {
        if (taxaRegeneracaoVida < 0) {
            throw new RuntimeException("Taxa de regeneração de vida fornecida é inválida");
        }
        
        this.taxaRegeneracaoVida = taxaRegeneracaoVida;
    }
    
}
