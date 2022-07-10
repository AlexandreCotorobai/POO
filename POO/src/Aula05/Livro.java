package Aula05;

public class Livro {
    private static int idfixo = 100;
    private int id;
    private String tituto;
    private TipoEmprestimo tipoEmprestimo = TipoEmprestimo.NORMAL;
    

    public Livro(String titulo, int Emprestimo) {
        this.id = idfixo++;
        this.tituto = titulo;
        if( Emprestimo == 1){
            this.tipoEmprestimo = TipoEmprestimo.NORMAL;
        }else if(Emprestimo == 0){
            this.tipoEmprestimo = TipoEmprestimo.CONDICIONAL;
        }else{
            throw new IllegalArgumentException("Tipo de emprestimo invalido (NORMAL = 1 e CONDICIONAL = 0)");
        }
    }
    public Livro(String titulo){
        this.id = idfixo++;
        this.tituto = titulo;
    }
    

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.tituto;
    }
    public TipoEmprestimo getTipoEmprestimo() {
        return this.tipoEmprestimo;
    }
    public void setTipoEmprestimo(TipoEmprestimo tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    @Override
    public String toString() {
        // if(this.getTipoEmprestimo() == null){
        //     return "Livro = " + this.id + "; " + this.tituto;
        // }
        return "Livro = " + this.id + "; " + this.tituto + "; " + this.tipoEmprestimo;
    }
}
