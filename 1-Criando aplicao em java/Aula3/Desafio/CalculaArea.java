import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}