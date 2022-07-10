package Aula07;

public abstract class Shape {
    String cor;
    abstract double getArea();
    abstract double getPerimeter();
    abstract String cor();

    
	public void setCor(String cor) {
        this.cor = cor;
    }

    public String equals(Shape f) {
        if (cor.equals(f.cor()) && (this.getArea() == f.getArea())) {
            return "Figuras iguais";
        } else {
            return "Figuras diferentes";
        }
    }
    @Override
    public String toString() {
        return "Cor: " + cor();
    }
}
