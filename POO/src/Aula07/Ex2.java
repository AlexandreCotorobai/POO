package Aula07;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int input;
		
       	DateAbstract date = new DateYMD(1, 1, 2000);
		DateND date2 = new DateND(1, 2, 2000);

		System.out.println(date2);
		date2.increment();
		System.out.println(date2);
		date2.decrement();
        

		do {
			System.out.println("\nDate operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			System.out.print("Escolha 0-5: ");
            input = sc.nextInt();
            

			switch (input) {
				case 1:
                    System.out.print("Dia : ");
					int d = sc.nextInt();
                    System.out.print("Mes : ");
					int m = sc.nextInt();
                    System.out.print("Ano : ");
					int y = sc.nextInt();

					date = new DateYMD(d, m, y);
					System.out.println("Created date: " + date);
					break;

				case 2:
					System.out.println("Current date: " + date.toString());
					break;

				case 3:
					date.increment();
					System.out.println("Increased date: " + date);
					break;

				case 4:
					date.decrement();
					System.out.println("Decreased date: " + date);
					break;

				case 0:
					break;
			}
		} while (input != 0);
        sc.close();
    }
}