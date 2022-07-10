package Aula05;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle(1);
		Rectangle rectangle = new Rectangle(1, 1);
		Triangle triangle = new Triangle(1, 1, 1);

		do {
			System.out.println("Geometric shapes operations:");
			System.out.println("1 - create new Circle");
			System.out.println("2 - create new Rectangle");
			System.out.println("3 - create new Triangle");
			System.out.println("4 - show current Circle");
			System.out.println("5 - show current Rectangle");
			System.out.println("6 - show current Triangle");
			System.out.println("7 - change Circle radius");
			System.out.println("8 - change Rectangle width and height");
			System.out.println("9 - change Triangle side1, side2 and side3");
			System.out.println("10 - show Circle area");
			System.out.println("11 - show Rectangle area");
			System.out.println("12 - show Triangle area");
			System.out.println("13 - show Circle perimeter");
			System.out.println("14 - show Rectangle perimeter");
			System.out.println("15 - show Triangle perimeter");
			System.out.println("0 - exit");

			System.out.println("Escolha uma operação: ");
            input = sc.nextInt();

			switch (input) {
				case 1:
					System.out.println("Introduza o raio: ");
                    double radius = sc.nextDouble();
					circle = new Circle(radius);
					System.out.println("Circle criado: " + circle);
					break;

				case 2:
					System.out.println("Introduza o comprimento: ");
					double width = sc.nextDouble();
					System.out.println("Introduza a altura:");
                    double height = sc.nextDouble();
					rectangle = new Rectangle(width, height);
					System.out.println("Rectangle criado: " + rectangle);
					break;

				case 3:
					System.out.println("Introduza o lado 1: ");
					double side1 = sc.nextDouble();
					System.out.println("Introduza o lado 2: ");
                    double side2 = sc.nextDouble();
					System.out.println("Introduza o lado 3: ");
                    double side3 = sc.nextDouble();
					triangle = new Triangle(side1, side2, side3);
					System.out.println("Triangle criado: " + triangle);
					break;

				case 4:
					System.out.println("Circle atual: " + circle.toString());
					break;

				case 5:
					System.out.println("Rectangle atual: " + rectangle.toString());
					break;

				case 6:
					System.out.println("Triangle atual: " + triangle.toString());
					break;

				case 7:
					System.out.println("Introduza o raio: ");
					double radius2 = sc.nextDouble();
					circle.setRadius(radius2);
					System.out.println("Circle atual: " + circle.toString());
					break;

				case 8:
					System.out.println("Introduza o comprimento: ");
					double width2 = sc.nextDouble();
					System.out.println("Introduza a altura: ");
					double height2 = sc.nextDouble();

					rectangle.setWidth(width2);
					rectangle.setHeight(height2);
					System.out.println("Rectangle atual: " + rectangle.toString());
					break;

				case 9:
					System.out.println("Introduza o lado 1:  ");
					double side11 = sc.nextDouble();
					System.out.println("Introduza o lado 2:  ");
					double side22 = sc.nextDouble();
					System.out.println("Introduza o lado 3:  ");
					double side33 = sc.nextDouble();

					triangle.setSide1(side11);
					triangle.setSide2(side22);
					triangle.setSide3(side33);
					System.out.println("Triangle atual: " + triangle.toString());
					break;

				case 10:
					System.out.println("Circle area: " + circle.getArea());
					break;

				case 11:
					System.out.println("Rectangle area: " + rectangle.getArea());
					break;

				case 12:
					System.out.println("Triangle area: " + triangle.getArea());
					break;

				case 13:
					System.out.println("Circle perimeter: " + circle.getPerimeter());
					break;

				case 14:
					System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
					break;

				case 15:
					System.out.println("Triangle perimeter: " + triangle.getPerimeter());
					break;

				case 0:
					break;
			}
		} while (input != 0);
		sc.close();
	}
}
