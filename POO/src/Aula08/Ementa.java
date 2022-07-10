package Aula08;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private String local;
    ArrayList<Prato> lista = new ArrayList<Prato>();

    public Ementa(String nome, String local) {
        super();
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Prato> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prato> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");

        for (Prato p : lista) {
            sb.append(p.toString() + "\n");
        }

        return sb.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ementa ementa = (Ementa) obj;
        if(this.getNome() != ementa.getNome()){
            return false;
        }
        if(this.getLista() != ementa.getLista()){
            return false;
        }
        return true;
    }

    public void addPrato(Prato p, DiaSemana d) {
        lista.add(p);
        p.setDia(d);
    }
}
