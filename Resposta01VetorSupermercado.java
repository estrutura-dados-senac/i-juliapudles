import java.util.Locale;
import java.util.Scanner;

public class Resposta01VetorSupermercado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        //cria vetor
        double[] faturamentos = new double[5];

        //le faturamento
        for (int i = 0; i < faturamentos.length; i++) {
            faturamentos[i] = scanner.nextDouble();
        }

        //inicia controles
        double soma = 0;
        double maiorValor = faturamentos[0];
        double menorValor = faturamentos[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        //percorre o vetor e calcula a soma dos vetores, o maior e menor vetor
        for (int i = 0; i < faturamentos.length; i++) {
            soma += faturamentos[i];
            if (faturamentos[i] > maiorValor) {
                maiorValor = faturamentos[i];
                indiceMaior = i;
            }
            if (faturamentos[i] < menorValor) {
                menorValor = faturamentos[i];
                indiceMenor = i;
            }
        }

        double media = soma / faturamentos.length;

        //mostra o resumo do fim do dia
        System.out.printf("Total do dia: %.2f%n", soma);
        System.out.printf("Media por caixa: %.2f%n", media);
        System.out.printf("Maior venda: Caixa %d com %.2f%n", (indiceMaior + 1), maiorValor);
        System.out.printf("Menor venda: Caixa %d com %.2f%n", (indiceMenor + 1), menorValor);

    }
}