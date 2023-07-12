import java.util.HashSet;
import java.util.Scanner;

public class terceiroDesafio {
    public static int contarParesComDiferenca(int[] vetor, int k) {
        HashSet<Integer> conjunto = new HashSet<>();
        int contador = 0;

        for (int num : vetor) {
            int alvo1 = num - k;
            int alvo2 = num + k;

            if (conjunto.contains(alvo1)) {
                contador++;
            }

            if (conjunto.contains(alvo2)) {
                contador++;
            }

            conjunto.add(num);
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        int resultado = contarParesComDiferenca(vetor, k);
        System.out.println(resultado);

        scanner.close();
    }
}
