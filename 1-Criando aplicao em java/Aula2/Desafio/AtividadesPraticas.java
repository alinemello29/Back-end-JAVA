package Aula2.Desafio;

public class AtividadesPraticas {
    public static void main(String[] args) {
        // 1. Média de Duas Notas
        double nota1 = 8.5;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        // 2. Casting de Variáveis
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // Casting de double para int
        System.out.println("O valor após casting de double para int é: " + valorInt);

        // 3. Concatenação de char e String
        char letra = 'A';
        String palavra = "BC";
        String mensagem = letra + palavra; // Concatenação
        System.out.println("A mensagem concatenada é: " + mensagem);

        // 4. Cálculo de Valor Total
        double precoProduto = 19.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é: R$ " + valorTotal);

        // 5. Conversão de Dólares para Reais
        double valorEmDolares = 100;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.printf("O valor em reais é: R$ %.2f%n", valorEmReais);

        // 6. Cálculo de Preço com Desconto
        double precoOriginal = 200;
        double percentualDesconto = 10; // 10%
        double desconto = (percentualDesconto / 100) * precoOriginal;
        double precoComDesconto = precoOriginal - desconto;
        System.out.printf("O novo preço com desconto é: R$ %.2f%n", precoComDesconto);
    }
}
