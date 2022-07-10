package Aula03;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double notaP, notaT, notaF;

        Scanner sc = new Scanner(System.in);
        System.out.print("NotaP: ");
        notaP = sc.nextDouble();
        System.out.print("NotaT: ");
        notaT = sc.nextDouble();
        sc.close();

        if (notaP < 0 || notaP > 20 || notaT < 0 || notaT > 20){
            System.out.println("Erro de nota!");
        }else if ((notaP < 7.0) || (notaT < 7.0)) {
            System.out.println("66 (reprovado por nota mínima)");
        }else{
            notaF = 0.4 * notaT + 0.6 * notaP;
            System.out.println(notaF);
            System.out.format("%.0f", notaF);
        }
    }
}
