package Aula07;

public class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private double preco;
    private boolean disponivel;
    private double avaliacao;
    
    public Alojamento(String codigo, String nome, String local, double preco, boolean disponivel, double avaliacao){
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.preco = preco;
        this.disponivel = disponivel;
        this.avaliacao = avaliacao;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", preco p/ noite=" + preco + ", disponivel=" + disponivel + ", avaliacao=" + avaliacao;
    }
}
