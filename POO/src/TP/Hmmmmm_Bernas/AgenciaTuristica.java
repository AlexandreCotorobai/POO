package TP.Hmmmmm_Bernas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgenciaTuristica extends Organizacao {
    private String name;
    private String address;
    private Set<Atividade> atividades;

    public AgenciaTuristica(String name, String address) {
        super(null);
        this.name = name;
        this.address = address;
        this.atividades = new HashSet<Atividade>();
    }

    public AgenciaTuristica(String name, String address, String telefone) {
        super(telefone);
        this.name = name;
        this.address = address;
        this.atividades = new HashSet<Atividade>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Atividade> atividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void add(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public int totalItems() {
        int aux = 0;
        for (Atividade a : atividades) {
            aux += a.locais().size();
        }
        return aux;
    }

    public List<String> getAllItems() {
        List<String> aux = new ArrayList<String>();
        for (Atividade a : atividades) {
            for (String s : a.locais()) {
                aux.add(s);
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return name + "\n\tAtividades:" + atividades.toString();
    }
}
