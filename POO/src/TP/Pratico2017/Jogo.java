package TP.Pratico2017;

public class Jogo {
    Equipa equipa1, equipa2;
    Bola bola;
    int nr;

    public Jogo(Equipa equipa1, Equipa equipa2, Bola bola, int nr) {
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.bola = bola;
        this.nr = nr;
    }


    public Equipa getEquipa1() {
        return this.equipa1;
    }

    public void setEquipa1(Equipa equipa1) {
        this.equipa1 = equipa1;
    }

    public Equipa getEquipa2() {
        return this.equipa2;
    }

    public void setEquipa2(Equipa equipa2) {
        this.equipa2 = equipa2;
    }

    public Bola getBola() {
        Bola.addBola();
        return this.bola;
    }

    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public int getNr() {
        return this.nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    @Override
    public String toString() {
        return "Jogo entre " + equipa1.nome + " e " + equipa2.nome;
    }

}
