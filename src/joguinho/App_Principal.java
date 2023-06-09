package joguinho;

import java.util.Random;
import java.util.Scanner;

public class App_Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int numeroAleatorio = random.nextInt(100) + 1;
            boolean acertou = false;
            int tentativas = 0;

            System.out.println("Bem-vindo ao jogo de adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100. Tente adivinhar!");

            while (!acertou) {
                System.out.print("Digite um número: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida! Digite apenas números.");
                    System.out.print("Digite um número: ");
                    scanner.next();
                }
                int numeroUsuario = scanner.nextInt();
                tentativas++;

                if (numeroUsuario == numeroAleatorio) {
                    acertou = true;
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(s).");
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("O número é maior. Tente novamente.");
                } else {
                    System.out.println("O número é menor. Tente novamente.");
                }
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
            String jogarNovamenteResposta = scanner.next();
            jogarNovamente = jogarNovamenteResposta.equalsIgnoreCase("S");
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}
