package br.ufes.lsp.errado.model;

/**
 *
 * @author rborges
 */
public abstract class Criatura {
    
    private double posicaoX;
    private double posicaoY;
    private double largura;
    private double altura;
    private double vida;

    public Criatura(double posicaoX, double posicaoY, double largura, double altura, double vida) {
        setPosicaoX(posicaoX);
        setPosicaoY(posicaoY);
        setLargura(largura);
        setAltura(altura);
        setVida(vida);
    }

    public double getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }

    public double getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if (vida < 0) {
            throw new RuntimeException("Vida fornecida é inválida");
        }
        
        this.vida = vida;
    }
    
}
