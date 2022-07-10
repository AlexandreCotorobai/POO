package Aula02;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, dist;
        Scanner sc = new Scanner(System.in);

        System.out.print("Abcissa de P1: ");
        x1 = sc.nextDouble();
        System.out.print("Ordenada de P1:");
        y1 = sc.nextDouble();

        System.out.print("Abcissa de P2: ");
        x2 = sc.nextDouble();
        System.out.print("Ordenada de P2:");
        y2 = sc.nextDouble();
        sc.close();
        
        dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println(dist);
    }
}
