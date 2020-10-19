package br.ufes.lsp.correto.model;

/**
 *
 * @author rborges
 */
public class Jogador extends Criatura {
    
    private double velocidade;

    public Jogador(double posicaoX, double posicaoY, double largura, double altura, double vida) {
        super(posicaoX, posicaoY, largura, altura, vida);
    }
    
    @Override
    public void mover(double qtdEmX, double qtdEmY) {
        setPosicaoX(getPosicaoX() + qtdEmX + Math.copySign(velocidade, qtdEmX));
        setPosicaoY(getPosicaoY() + qtdEmY + Math.copySign(velocidade, qtdEmY));
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
}
