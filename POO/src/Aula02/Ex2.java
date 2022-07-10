package Aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        double temp, fahr;

        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius? ");
        temp = sc.nextDouble();
        sc.close();
        
        fahr = 1.8 * temp + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahr);
    }
}
