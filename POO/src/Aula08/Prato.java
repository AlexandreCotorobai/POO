package Aula08;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Alimento> composicao = new ArrayList<Alimento>();
    private DiaSemana dia;

    public Prato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Alimento> getComposicao() {
        return composicao;
    }

    public void setComposicao(ArrayList<Alimento> composicao) {
        this.composicao = composicao;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        if (dia != null) {
            return String.format("Prato %s, composto por %d Ingredientes, dia %s", nome, composicao.size(), dia);
        } else {
            return String.format("Prato %s, composto por %d Ingredientes", nome, composicao.size());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato prato = (Prato) obj;
        if(this.getNome() != prato.getNome()){
            return false;
        }
        if(this.getComposicao() != prato.getComposicao()){
            return false;
        }
        return true;
    }

    public boolean addIngrediente(Alimento c) {
        composicao.add(c);
        return true;
    }

}
