package TP.Pratico2017;

public class Robo extends ObjetoMovel {
    String id;
    TipoJogador tipo;
    int golos;

    public Robo(String id, TipoJogador tipo, int x, int y) {
        super(x,y);
        this.id = id;
        this.tipo = tipo;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoJogador getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoJogador tipo) {
        this.tipo = tipo;
    }

    public int getGolos() {
        return this.golos;
    }

    public void setGolos(int golos) {
        this.golos = golos;
    }

    public void marcaGolo() {
        this.golos++;
        
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    //override tostring
    @Override
    public String toString() {
        return "Robo{" + "id=" + id + ", tipo=" + tipo + ", golos=" + golos + '}';
    }
}
