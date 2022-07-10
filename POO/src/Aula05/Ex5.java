package Aula05;

import java.util.*;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, nMec, livroId;
        String nome, curso;  
        List<Utilizador> alunosList = new ArrayList<>();
        List<Livro> livrosList = new ArrayList<>(); 
        Map<Integer, Set<Integer>> emprestimosList = new HashMap<>();                              
        do {
            menu();
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 0:
                    break;
                case 1:
                    System.out.println("Nome Utilizador?");
                    nome = sc.nextLine();
                    System.out.println("nMec?");
                    nMec = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Curso?");
                    curso = sc.nextLine();
                    alunosList.add(new Utilizador(nome, nMec, curso));
                    break;
                case 2:
                    System.out.println("nMec do aluno a remover?");
                    nMec = sc.nextInt();
                    for (Utilizador u: alunosList){
                        if (u.getnMec() == nMec){
                            alunosList.remove(u);
                        }
                    }
                    break;
                case 3:
                    for (Utilizador u: alunosList){
                        System.out.println(u);
                    }
                    break;
                case 4:
                    System.out.println("Titulo?");
                    nome = sc.nextLine();
                    System.out.println("Emprestimo(Normal = 1, Condicional = 0)?");
                    nMec = sc.nextInt();
                    livrosList.add(new Livro(nome, nMec));
                    break;
                case 5:
                    for (Livro l: livrosList){
                        System.out.println(l);
                    }
                    break;
                case 6:
                    System.out.println("nMec do aluno?");
                    nMec = sc.nextInt();
                    System.out.println("ID do livro");
                    livroId = sc.nextInt();
                    for (Livro l: livrosList){
                        if (l.getId() == livroId){
                            if(l.getTipoEmprestimo().equals(TipoEmprestimo.NORMAL)){
                                if(emprestimosList.containsKey(nMec)){
                                    if(emprestimosList.get(nMec).size() < 3){
                                        emprestimosList.get(nMec).add(livroId);
                                        l.setTipoEmprestimo(TipoEmprestimo.CONDICIONAL);
                                    }else{
                                        System.out.println("Limite de livros atingido");
                                        break;
                                    }
                                } else {
                                    Set<Integer> livros = new HashSet<>();
                                    livros.add(livroId);
                                    emprestimosList.put(nMec, livros);
                                    l.setTipoEmprestimo(TipoEmprestimo.CONDICIONAL);
                                    break;
                                }
                            }else{
                                System.out.println("Livro não disponivel");
                            }
                        }
                    }
                    System.out.println(emprestimosList);
                    break;
                case 7:
                    System.out.println("nMec do aluno?");
                    nMec = sc.nextInt();
                    System.out.println("ID do livro");
                    livroId = sc.nextInt();
                    for (Livro l: livrosList){
                        if (l.getId() == livroId){
                            if(l.getTipoEmprestimo().equals(TipoEmprestimo.CONDICIONAL)){
                                if(emprestimosList.containsKey(nMec)){
                                    if(emprestimosList.get(nMec).contains(livroId)){
                                        emprestimosList.get(nMec).remove(livroId);
                                        l.setTipoEmprestimo(TipoEmprestimo.NORMAL);
                                    }else{
                                        System.out.println("Aluno nao requesitou o livro");
                                        break;
                                    }
                                    if(emprestimosList.get(nMec).size() == 0){
                                        emprestimosList.remove(nMec);
                                    }
                                } else {
                                    System.out.println("Aluno nao requesitou o livro");
                                    break;
                                }
                            }else{
                                System.out.println("Livro não requesitado");
                            }
                        }
                    }

                    break;
                default:
                    System.out.println("Input is not a option.");
                    break;
            }
            System.out.println("--------------------------------");
        } while (input != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("--------------Operacoes:-----------------");
        System.out.println("1 - inscrever utilizador");
        System.out.println("2 - remover utilizador");
        System.out.println("3 - imprimir lista de utilizadores");
        System.out.println("4 - registar um novo livro");
        System.out.println("5 - imprimir lista de livros");
        System.out.println("6 - emprestar");
        System.out.println("7 - devolver");
        System.out.println("0 - exit");
    }
}