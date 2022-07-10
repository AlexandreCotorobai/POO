package Aula08;


public class Ex1 {
    public static void main(String[] args) {
        Empresa emp = new Empresa("Stand", "1111-111", "alugo@carros.com");
        AutoLigeiro carro = new AutoLigeiro("12DA23", "Nissan", "GTR", 450, "GAMING123", 20);
        Motociclo mota = new Motociclo("23TA23", "Kawasaki", "Ninja", 100, "Sport");
        AutoLigeiro taxi = new Taxi("986G23", "Taxi", "modelo de taxi", 234, "nrq Taxi", 54, 21313213);
        PesadoMerc camiao = new PesadoMerc("23TA23", "Kawaki", "Nia", 100, "fawwfa2r2r", 9000, 5000);
        PesadoPass autobus = new PesadoPass("26AA23", "Kki", "nja", 100, "fawar", 9000, 50);
        Veiculo camiao2 = new PesadoMerc("23TA23", "Kawaki", "Nia", 100, "faww2r2r", 9000, 5700);

        System.out.println("-------Classe Taxi------------");
        System.out.println(taxi);
        
        System.out.println();
        System.out.println("----------Dados Empresa-------------\n");

        emp.addVeiculo(carro);
        emp.addVeiculo(mota);
        emp.addVeiculo(camiao);
        emp.addVeiculo(camiao2);
        emp.addVeiculo(autobus);
        System.out.println(emp);
        System.out.println();

        System.out.println("----------Frota (List)------------\n");
        System.out.println(emp.getFrota());
    
        mota.trajeto(2000);
        mota.trajeto(7000);
        carro.trajeto(8000);
        carro.trajeto(500);

        System.out.println();
        System.out.println("----------Kmpercorridos methods------------\n");
        System.out.println(mota.distanciaTotal());
        System.out.println(carro.ultimoTrajeto());

        System.out.println();
        System.out.println("----------Veicle com mais kms------------\n");
        /// Veiculo com mais kms
        if(emp.getFrota().size() != 0){
            int max = 0;
            Veiculo veiculof = new Veiculo("dawda", "dawd", "dwadaw", 100);
            //Como caso nao existam veiculos vai dar print a que nao existe nada para comparar o veiculof nunca vai ter estes dados,
            //apenas coloquei isto aqui porque o VSCode não esta a deixar prosseguir mesmo certificando-me que existia pelo menos 1 carro na lista
            for(Veiculo veiculo : emp.getFrota()){
                if(veiculo.distanciaTotal() >= max){
                    max = veiculo.distanciaTotal();
                    veiculof = veiculo;
                }
            }
            System.out.println("O veiculo com mais kms foi o " + veiculof.getClass().getSimpleName() + " de matricula " + veiculof.getMatricula() + " com " + max + "kms");
        }else{
            System.out.println("Não há veiculos a comparar");
        }

        System.out.println();
        System.out.println("----------Comparar------------\n");
        System.out.println(camiao.equals(camiao2));
        System.out.println(carro.equals(taxi));

        System.out.println("----------Eletrico------------\n");
        VeiculoEletrico carroeletrico = new AutoLigeiroEletric("12DA23", "Nissan", "GTR", 450, "GAMING123", 20);
        VeiculoEletrico buseletrico = new PesadoPassEletric("26AA23", "Kki", "nja", 100, "fawar", 9000, 50);
        System.out.println("Carro antes de carregar: " + carroeletrico.autonomia());
        carroeletrico.carregar(50);
        buseletrico.carregar(110); //qualquer percentagem acima de 100 vai parar nos 100
        System.out.println("Carro depois de carregar: " + carroeletrico.autonomia());
        System.out.println("Bus full: " + buseletrico.autonomia());

        System.out.println("\n----------Validacoes------------\n");
        System.out.println(carro.isMatriculaValida());
        System.out.println(taxi.isMatriculaValida());
        System.out.println(emp.isEmailValido());
    }   

}
