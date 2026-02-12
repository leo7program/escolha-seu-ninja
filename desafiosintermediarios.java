package desafios;

import java.util.Scanner;

public class desafiosintermediarios {

    public static void main(String[] args) {

        Scanner caixadetexto = new Scanner(System.in);
        int opcao;

        // Criando objetos UMA VEZ só
        ninjas naruto = new ninjas();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.missao = "Salvar um cachorro";
        naruto.niveldedificuldade = "Fácil";
        naruto.statusdamissao = false;

        ninjas sasuke = new ninjas();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.missao = "Eliminar um inimigo da Vila da Areia";
        sasuke.niveldedificuldade = "Média";
        sasuke.statusdamissao = false;

        do {

            System.out.println("\n=== ESCOLHA UM NINJA ===");
            System.out.println("1 - Naruto");
            System.out.println("2 - Sasuke");
            System.out.println("3 - Sair");

            opcao = caixadetexto.nextInt();

            switch (opcao) {

                case 1:
                    naruto.mostrarInformacoes();

                    System.out.println("\n1 - Concluir missão");
                    System.out.println("2 - Voltar");

                    int escolhaNaruto = caixadetexto.nextInt();

                    if (escolhaNaruto == 1) {
                        naruto.concluirMissao();
                    }
                    break;

                case 2:
                    sasuke.mostrarInformacoes();

                    System.out.println("\n1 - Concluir missão");
                    System.out.println("2 - Voltar");

                    int escolhaSasuke = caixadetexto.nextInt();

                    if (escolhaSasuke == 1) {
                        sasuke.concluirMissao();
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        caixadetexto.close();
    }
}
