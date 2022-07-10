package TP.Hmmmmm_Bernas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Gastronomia extends Atividade {
    private List<Restaurante> restaurantes = new ArrayList<Restaurante>();

    public Gastronomia(int id, String name, List<Restaurante> restaurantes) {
        super(id, name);
        for (Restaurante restaurante : restaurantes) {
            this.restaurantes.add(restaurante);
        }
    }

    public Gastronomia(int id, String name) {
        super(id, name);
    }

    public List<Restaurante> getLista() {
        return restaurantes;
    }
    
    public void add(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    public int totalRestaurantes() {
        return restaurantes.size();
    }

    @Override
    public Collection<String> locais() {
        Collection<String> locais = new ArrayList<String>();
        for (Restaurante restaurante : restaurantes) {
            locais.add(restaurante.toString());
        }
        return locais;
    }


}
