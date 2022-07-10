package TP.Hmmmmm_Bernas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PasseioBicicleta extends Atividade {
    Set<String> locais = new HashSet<String>();

    public PasseioBicicleta(int id, String name, String[] locais) {
        super(id, name);
        for (String local : locais) {
            this.locais.add(local);
        }
    }

    public PasseioBicicleta(int id, String name) {
        super(id, name);
    }

    public Set<String> getLocais() {
        return locais;
    }

    public void setLocais(Set<String> locais) {
        this.locais = locais;
    }

    public void addLocal(String local) {
        this.locais.add(local);
    }
    
    @Override
    public Collection<String> locais() {
        return locais;
    }
}
