package Aula03;

public class Ex8 {
    public static void main(String[] args) {
        double[][] notas = new double[16][3];

        System.out.printf("%8s %8s %8s\n", "NotaT", "NotaP", "Pauta");

        for(double[] comp : notas){
            comp[0] = (double) (Math.random()*20);
            comp[1] = (double) (Math.random()*20);
            comp[2] = 0.4 * comp[0] + 0.6 * comp[1];

            System.out.printf("%8.1f %8.1f %8.1f\n", comp[0], comp[1], comp[2]);
        }
    }
}
