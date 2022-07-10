package Aula07;

public class Apartamento extends Alojamento{
    private int quartos;

    public Apartamento(String codigo, String nome, String local, double preco, boolean disponivel, double avaliacao, int quartos){
        super(codigo,nome,local,preco,disponivel,avaliacao);
        this.quartos = quartos;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
    
    @Override
    public String toString() {
        return "Apartamento: quartos=" + quartos + " ".concat(super.toString());

    }
}
