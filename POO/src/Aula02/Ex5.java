package Aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        double v1, d1, v2, d2, vm;

        Scanner sc = new Scanner(System.in);
        System.out.print("V1?: ");
        v1 = sc.nextDouble();
        System.out.print("D1?: ");
        d1 = sc.nextDouble();

        System.out.print("V2?: ");
        v2 = sc.nextDouble();
        System.out.print("D2?: ");
        d2 = sc.nextDouble();
        sc.close();

        vm = (d1 + d2) / (d1/v1 + d2/v2);
        System.out.println(vm);
    }
}