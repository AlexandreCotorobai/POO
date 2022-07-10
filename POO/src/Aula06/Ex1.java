package Aula06;


public class Ex1 {
    public static void main(String[] args) {
        // Date d = new Date(5, 10, 1988);
        // Pessoa p = new Pessoa("Ana Santos", 98012244, d);

        Aluno al = new Aluno("Andreia Melo", 9855678, new Date(18, 7, 1990)); // Por omissao DataInsc
        Aluno al2 = new Aluno("Andreia Melo2", 1111111, new Date(23, 2, 2001), new Date(11, 4, 1111)); // Com DataInsc
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976743, new Date(11, 5, 1985), 900);

        // Teste -> Exemplo Errado (+-)
        // Pessoa p = new Bolseiro ("Igor Santos", 8976743, new Date(11, 5, 1985), 900);
        // Bolseiro b = new Pessoa("fafwaf", 3232322323, new Date(11, 5, 1985));
        // System.out.println(p);

        System.out.println("Montante inicial: " + bls.getMontante());
        bls.setMontante(1050);


        System.out.println("Aluno: " + al.getName() + "; NMec: " + al.getNMec()); // NMec para confirmar
        System.out.println(al);
        System.out.println();

        System.out.println("Aluno2: " + al2.getName() + "; NMec: " + al2.getNMec());
        System.out.println(al2);
        System.out.println();

        System.out.println("Bolseiro: " + bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa: " + bls.getMontante());
        System.out.println(bls);
    }
    
}
