package Aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double montante, taxa, meses;

        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido:");
        montante = sc.nextDouble();
        System.out.print("Taxa de Juro (%):");
        taxa = sc.nextDouble();
        System.out.print("Meses:");
        meses = sc.nextDouble();
        sc.close();
        

        for (int i=0; i<meses; i++){
            montante = montante * (1 + (taxa/100));
        }

        System.out.println(montante);
    }
}
