package TP.Hmmmmm;

import java.util.*;

public class AgenciaTuristica {
    String nome, endereco;
    Set<Atividade> atividades = new HashSet<>();

    public AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Set<Atividade> getAtividades() {
        return this.atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void add(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public int totalItems() {
        int v = 0;
        for (Atividade atividade : atividades) {
            v += atividade.locais().size();
        }
        return v;
    }
    @Override
    public String toString(){
        return nome + "\n\tAtividade: " + atividades.toString();
    }
}
