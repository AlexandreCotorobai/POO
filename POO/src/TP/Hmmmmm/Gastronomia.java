package TP.Hmmmmm;
import java.util.*;

public class Gastronomia extends Atividade{
    private List<Restaurante> lista = new ArrayList<>();

    public Gastronomia(int id, String nome, List<Restaurante> lista) {
        super(id,nome);
        this.lista = lista;
    }
    public Gastronomia(int id, String nome) {
        super(id,nome);
    }


    public List<Restaurante> getLista() {
        return this.lista;
    }

    public void setLista(List<Restaurante> lista) {
        this.lista = lista;
    }

    public void add(Restaurante restaurante) {
        this.lista.add(restaurante);
    }

    public int totalRestaurantes(){
        return this.lista.size();
    }

    @Override
    public Collection <String> locais() {
        List<String> locais = new ArrayList<>();
        for(Restaurante restaurante : lista){
            locais.add(restaurante.toString());
        }
        return locais;
    }
    @Override
    public String toString(){
        return lista.toString();
    }
}
