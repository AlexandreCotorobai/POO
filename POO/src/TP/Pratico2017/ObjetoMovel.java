package TP.Pratico2017;

public class ObjetoMovel {
    private int velocidade, x, y;
    private double  distancia;

    public ObjetoMovel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        this.distancia = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    public void move(int x, int y, double velocidade) {
        this.x = x;
        this.y = y;
        this.velocidade = (int) velocidade;
        this.distancia = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


}
