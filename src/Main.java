import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean[] cadeiras = new boolean[10];
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\nEscolha uma opção;");
            System.out.println("1- Verificar cadeiras");
            System.out.println("2- Reservar cadeiras");
            System.out.println("3- Sair");
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Estado das cadeiras:");
                    for (int i = 0; i < cadeiras.length; i++) {
                        System.out.println("Cadeira " + (i + 1) + ": " + (cadeiras[i] ? "Reservada" : "Disponível"));
                    }
                    break;

                case 2:
                    System.out.print("Digite o número da cadeira (1-10) para reservar: ");
                    int numCadeira = scanner.nextInt();

                    if (numCadeira < 1 || numCadeira > 10) {
                        System.out.println("Número inválido! Escolha entre 1 e 10.");
                        break;
                    }

                    if (cadeiras[numCadeira - 1]) {
                        System.out.println("Erro: A cadeira " + numCadeira + " já está reservada!");
                    } else {
                        cadeiras[numCadeira - 1] = true;
                        System.out.println("Cadeira " + numCadeira + " reservada com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}