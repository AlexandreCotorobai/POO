package Aula02;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        double A, B, hip, ang;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cateto A: ");
        A = sc.nextDouble();
        System.out.print("Cateto B: ");
        B = sc.nextDouble();
        sc.close();

        hip = Math.sqrt(A*A + B*B);
        System.out.println("Hipotenusa: " + hip);
        ang = Math.toDegrees(Math.acos(A/hip));
        System.out.println(ang);
    }
}
