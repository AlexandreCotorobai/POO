package Aula07;

public class Carro {
    private int matricula;
    private char classe;
    private String combustivel;
    private boolean disponivel;
    private static int counter = 0;

    public Carro(char c, String comb) {
        classe = c;
        combustivel = comb;
        disponivel = true;
        matricula = ++counter;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getId() {
        return matricula;
    }

    public void setId(int matricula) {
        this.matricula = matricula;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Carro.counter = counter;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro: Código=" + matricula + ", classe=" + classe + ", combustivel=" + combustivel + ", disponivel=" + disponivel;
    }
}
