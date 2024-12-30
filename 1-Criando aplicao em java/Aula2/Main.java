package Aula2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Barbie");

    int anoDeLancamento = 2024;
    System.out.println("Ano de Lançamento:" + anoDeLancamento)
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;

    double media = (9.8 + 7.8 + 5.7)/3;
    System.out.println(media);
    String sinopse;
    sinopse = """
            Filme da barbie com seu namorado
            Venha ver o filme 
            """ + anoDeLancamento;
    System.out.println(sinopse);

    int classificacao;
    classificacao = (int) (media /2);
    System.out.println(classificacao);
    }
}
