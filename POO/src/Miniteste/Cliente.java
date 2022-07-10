package Miniteste;

import Aula05.Date;

public class Cliente {
    private String nome;
    private Date dataNascimento;
    private String morada;
    private int NIF;

    public Cliente(String nome, Date dataNascimento, String morada, int NIF) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.NIF = NIF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNIF() {
        return this.NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }


    @Override
    public String toString() {
        return "Cliente: " + this.nome + "(" + this.NIF + ")";
    }

}
