package desafios;

public class ninjas {

    String nome;
    String aldeia;
    int idade;
    String missao;
    String niveldedificuldade;
    boolean statusdamissao;

    public void mostrarInformacoes() {
        System.out.println("\n--- INFORMAÇÕES DO NINJA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + niveldedificuldade);
        System.out.println("Status da missão: " + statusdamissao);
    }

    public void concluirMissao() {
        if (!statusdamissao) {
            statusdamissao = true;
            System.out.println("Missão concluída com sucesso!");
        } else {
            System.out.println("Essa missão já foi concluída!");
        }
    }
}
