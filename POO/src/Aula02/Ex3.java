package Aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        double M, initialT, finalT, Q;

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de água: ");
        M = sc.nextDouble();
        System.out.print("Insira a temperatura inicial: ");
        initialT = sc.nextDouble();
        System.out.print("Insira a temperatura final: ");
        finalT = sc.nextDouble();
        sc.close();
        
        Q = M * (finalT - initialT) * 4184;
        System.out.println(Q);

    }
}
