package Aula06;
import java.time.LocalDate;
// LocalDate today = LocalDate.now();
// int day = today.getDayOfMonth();
// int month = today.getMonthValue();
// int year = today.getYear();


public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date nascimento){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = nascimento;
        if (validar(nome, cc)) { ///Date.java ja valida a data
            throw new IllegalArgumentException("Nome e/ou CC invalido!");
        }
    }
    public String getName(){
        return this.nome;
    }
    public int getCC(){
        return this.cc;
    }
    public Date getDate(){
        return this.dataNasc;
    }

    boolean validar(String nome, int cc){
        return ((nome == "") || (String.valueOf(cc).length() != 7));
    }

    @Override
    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cc;
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cc != other.cc)
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
class Aluno extends Pessoa {
    private int nmec;
    private Date inscricao;
    private static int n = 100;

    Aluno(String nome, int cc, Date dataNasc){
        super(nome, cc, dataNasc);
        this.nmec = n;
        n++;
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        inscricao = new Date(day, month, year);
    }
    Aluno(String nome, int cc, Date dataNasc, Date datainsc){
        super(nome, cc, dataNasc);
        this.nmec = n;
        n++;
        inscricao = datainsc;
    }
    public int getNMec(){
        return this.nmec;
    }
    public Date getDataInsc(){
        return this.inscricao;
    }
    @Override
    public String toString() {
        ///Adicionei o print da DataInsc para testar se estava a dar para colocar datas manualmente
        return getName() + "; CC: " + getCC()+ "; Data de Nascimento: " + getDate() + "; Data de inscrição: " + getDataInsc();
    }
}
class Bolseiro extends Aluno{
    private int montante;
    Bolseiro(String nome, int cc, Date data, int montante){
        super(nome, cc, data);
        this.montante = montante;
    }
    public int getMontante(){
        return this.montante;
    }
    public void setMontante(int montante){
        this.montante = montante;
    }
    @Override
    public String toString() {
        ///Adicionei o print da DataInsc para testar se estava a dar para colocar datas manualmente
        return getName() + "; CC: " + getCC()+ "; Data de Nascimento: " + getDate() + "; Data de inscrição: " + getDataInsc();
    }

}