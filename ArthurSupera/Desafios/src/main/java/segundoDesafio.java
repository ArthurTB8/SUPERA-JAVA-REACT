import java.util.Scanner;

public class segundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = Double.parseDouble(scanner.next().replace(",", "."));
        int notas[] = {100, 50, 20, 10, 5, 2};

        int moedas[] = {100, 50, 25, 10, 5, 1};

        int notasUsadas[] = new int[6];

        int moedasUsadas[] = new int[6];

        int valorInteiro = (int) valor;

        int valorCentavos = (int) Math.round((valor - valorInteiro) * 100);

        for (int i = 0; i < notas.length; i++) {
            notasUsadas[i] = valorInteiro / notas[i];
            valorInteiro %= notas[i];
        }
        for (int i = 0; i < moedas.length; i++) {
            moedasUsadas[i] = valorCentavos / moedas[i];
            valorCentavos %= moedas[i];
        }

        System.out.println("NOTAS:");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d.00\n", notasUsadas[i], notas[i]);
        }

        System.out.println("MOEDAS:");

        for (int i = 0; i < moedas.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", moedasUsadas[i], moedas[i] / 100.0);
        }
    }
}
