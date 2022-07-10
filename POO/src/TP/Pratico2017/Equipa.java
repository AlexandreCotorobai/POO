package TP.Pratico2017;
import java.util.*;

public class Equipa {
    String nome, responsavel;
    int golosmarcados, golossofridos;
    Set<Robo> robos = new HashSet<Robo>();

    public Equipa (String nome, String responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getGolosMarcados() {
        for (Robo r : robos) {
            golosmarcados += r.getGolos();
        }
        return this.golosmarcados;
    }

    public void setGolosMarcados(int golosmarcados) {
        this.golosmarcados = golosmarcados;
        // for (Robo r : robos) {
        //     golosmarcados += r.getGolos();
        // }
    }

    public int getGolosSofridos() {
        return this.golossofridos;
    }

    public void setGolosSofridos(int golossofridos) {
        this.golossofridos = golossofridos;
    }
    public Robo[] getRobos2() {
        List <Robo> roboslist = new ArrayList<Robo>();
        roboslist.addAll(robos);
        return (Robo[]) roboslist.toArray();
    }

    public Robo[] getRobos() {
        Robo[] rb = new Robo[robos.size()];
        rb = robos.toArray(rb);

        return rb;
    }

    public void setRobos(Set<Robo> robos) {
        this.robos = robos;
    }

    public void add(Robo r){
        robos.add(r);
    }

    public void remove(Robo r){
        robos.remove(r);
    }
    
    @Override
    public String toString() {
        String str = String.format("""
            Equipa %s, treinada por %s (%d jogadores)
            Robos:""", this.nome, this.responsavel, this.robos.size());
        for (Robo r : robos){
            str += r.toString();
        }   
        str += String.format("\ngolosMarcados=%s\n", this.golosmarcados);

    return str;
    }

}
