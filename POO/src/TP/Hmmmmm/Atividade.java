package TP.Hmmmmm;

import java.util.Collection;

public abstract class Atividade implements PontosdeInteresse {
    private int id;
    private String nome;

    public Atividade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Collection <String> locais();

    @Override
    public String toString() {
        return "Atividade [num=" + id + ", nome=" + nome + ']';
    }

}
