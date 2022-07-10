package Aula05;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;

    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public void setnMec(int nMec){
        this.nMec = nMec;
    }
    public int getnMec(){
        return this.nMec;
    }

    @Override
    public String toString(){
        return "Aluno: "+ this.nMec + "; " + this.nome + "; " + this.curso;
    }
}
