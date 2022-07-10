package TP.Pratico2017;

public class Bola extends ObjetoMovel {
    CorDaBola cor;
    public static int nBolas = 0;

    public Bola(CorDaBola cor) {
        super(0, 0);
        this.cor = cor;
    }


    public CorDaBola getCor() {
        return this.cor;
    }

    public void setCor(CorDaBola cor) {
        this.cor = cor;
    }

    public static void addBola() {
        nBolas++;
    }

    public static int getnBolas() {
        return nBolas;
    }
    

}
