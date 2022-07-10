package TP.Hmmmmm;

public class Restaurante {
    String nome;
    TipoComida tipo;

    public Restaurante(String nome, TipoComida tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoComida getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
    
}
