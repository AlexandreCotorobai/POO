package TP.Hmmmmm_Bernas;

public class Restaurante extends Organizacao{
    private String nome;
    private TipoComida tipoComida;

    public Restaurante(String nome, TipoComida tipoComida) {
        super(null);
        this.nome = nome;
        this.tipoComida = tipoComida;
    }

    public Restaurante(String nome, TipoComida tipoComida, String telefone) {
        super(telefone);
        this.nome = nome;
        this.tipoComida = tipoComida;
    }

    public String getNome() {
        return nome;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString(){
        return "Restaurante [nome=" + nome + ", tipo=" + tipoComida + "]";
    }

}
