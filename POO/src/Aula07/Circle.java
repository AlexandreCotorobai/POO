package Aula07;

public class Circle extends Shape{
    private double radius;

	public Circle(double radius) {
		if (!validRadius(radius)) {
			throw new IllegalArgumentException("Radius cannot be negative.");
		}

		this.radius = radius;
		this.cor = "White";
	}
	public Circle(double radius, String cor) {
		if (!validRadius(radius)) {
			throw new IllegalArgumentException("Radius cannot be negative.");
		}

		this.radius = radius;
		this.cor = cor;
	}

	public String cor() {
        return cor;
    }

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (!validRadius(radius)) {
			throw new IllegalArgumentException("Radius cannot be negative.");
		}

		this.radius = radius;
	}

	public boolean equals(Circle circle) {
		return this.radius == circle.getRadius();
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle with radius " + this.radius;
	}

	private boolean validRadius(double radius) {
		return radius >= 0;
	}
}
