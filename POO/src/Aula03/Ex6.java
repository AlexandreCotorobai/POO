package Aula03;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        //String valorlido;
        int dia, mes, ano;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Insira mes: ");
            mes = sc.nextInt();
            System.out.print("Insira ano: ");
            ano = sc.nextInt();
        }while(mes < 1 || mes > 12 || ano <= 0);

        sc.close();

        switch(mes){
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            case 2:
                if(ano%4 == 0){
                    if(ano%100 == 0){
                        if(ano%400 == 0){
                            dia = 29;
                        }else{
                            dia = 28;
                        }
                    }else{
                        dia = 29;
                    }
                }else{
                    dia = 28;
                }
                break;
            default:
                dia = 31;
        }

        System.out.println("Nr dias: "+ dia);

    }
}
