package Aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        double dist, milhas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é a distancia em kmh? ");
        dist = sc.nextDouble();
        milhas = dist / 1.609;
        sc.close();

        System.out.println(milhas);
    }
}
