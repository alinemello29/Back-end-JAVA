public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.8;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que os clientes amam!");
        } else {
            System.out.println("Filme cor de rosa");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Devo pagar");
        }
    }
}