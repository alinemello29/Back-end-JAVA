import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem até 5 tentativas.");

        while (tentativas < 5) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                acertou = true;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
        }

        if (!acertou) {
            System.out.println("Você não acertou. O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}