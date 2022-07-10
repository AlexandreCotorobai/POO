package TP.Hmmmmm;
import java.util.*;

public class PasseioBicicleta extends Atividade {
    private Set<String> locais = new HashSet<>();

    public PasseioBicicleta(int id, String nome, String[] locais) {
        super(id, nome);
        this.locais = new HashSet<>(Arrays.asList(locais));
    }

    public PasseioBicicleta(int id, String nome) {
        super(id, nome);
    }

    public Set<String> getLocais() {
        return this.locais;
    }

    public void setLocais(Set<String> locais) {
        this.locais = locais;
    }

    public void addLocal(String local) {
        this.locais.add(local);
    }

    @Override
    public Collection <String> locais() {
        return locais;
    }

}
