package Aula07;

public class Quarto extends Alojamento{
    private String tipo;

    public Quarto(String codigo, String nome, String local, double preco, boolean disponivel, double avaliacao, String tipo){
        super(codigo,nome,  local, preco, disponivel, avaliacao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "QuartoHotel: tipo=" + tipo + " ".concat(super.toString());
    }
}
