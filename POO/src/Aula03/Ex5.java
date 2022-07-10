package Aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double deposito, juro;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduzir depósito inicial: ");
            deposito = sc.nextDouble();
            System.out.print("Introduzir taxa de juro: ");
            juro = (sc.nextDouble())/100;
        }while(deposito < 0 || deposito%1000 != 0 || juro < 0 || juro > 5);

        sc.close();

        for(int i = 0; i < 12; i++){
            deposito += deposito*juro;
            System.out.printf("Valor do fundo ao "+ (i+1) +"º mês: %.2f \n", deposito);
        }

    }
}
