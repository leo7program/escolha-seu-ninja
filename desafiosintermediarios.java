package desafios;

import java.util.Scanner;

public class desafiosintermediarios {
    public static void main(String[] args) {
        Scanner caixadetexto = new Scanner(System.in);
        int opcao;
        do {

//                        menu
            System.out.println("escolha um ninja!!");
            System.out.println("1--naruto");
            System.out.println("2--sasuke");
            System.out.println("3-- sair");

            opcao=caixadetexto.nextInt();

//

            ninjas naruto = new ninjas();
            naruto.nome = "naruto";
            naruto.aldeia = "aldeia da folha";
            naruto.idade = 17;
            naruto.missao = "salvar um cachorro";
            naruto.niveldedificuldade = "fácil";
            naruto.statusdamissao = false;


//

            uchiha sasuke = new uchiha();
            sasuke.nome = "sasuke";
            sasuke.aldeia = "aldeia da folha";
            sasuke.idade = 18;
            sasuke.missao = "matar um genin da vila da areia";
            sasuke.niveldedificuldade = "média";
            sasuke.statusdamissao = false;



//
            switch (opcao) {
                case (1):
                    System.out.println("--informações do naruto--");
                    System.out.println("nome: " + naruto.nome);
                    System.out.println("idade: " + naruto.idade);
                    System.out.println("aldeia: " + naruto.aldeia);
                    System.out.println("missão: " + naruto.missao);
                    System.out.println("nivel de dificuldade da missão: " + naruto.niveldedificuldade);
                    System.out.println("status da missão: " + naruto.statusdamissao);
                    break;

                case (2):
                    System.out.println("--informações do sasuke--");
                    System.out.println("nome: " + sasuke.nome);
                    System.out.println("idade: " + sasuke.idade);
                    System.out.println("aldeia: " + sasuke.aldeia);
                    System.out.println("missão: " + sasuke.missao);
                    System.out.println("nivel de dificuldade da missão: " + sasuke.niveldedificuldade);
                    System.out.println("status da missão: " + sasuke.statusdamissao);
                    System.out.println("habilidade secreta é :"+ sasuke.sharingan);
                    break;

                case (3):
                    System.out.println("saindo...");
                    break;

                default:
                    System.out.println("opção inválida");

            }
            System.out.println();

        } while (opcao !=3);

    }
}
