package TP.Hmmmmm_Bernas;

import java.util.Collection;

public class Atividade implements PontosdeInteresse {
    private int id;
    private String name;

    public Atividade(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Collection<String> locais() {
        return null;
    }

    @Override
    public String toString() {
        return "Atividade [num=" + id + ", nome=" + name + ']';
    }
}  
