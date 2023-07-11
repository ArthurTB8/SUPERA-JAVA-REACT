import java.util.*;

public class primeiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de linhas de entrada: ");
        int n = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor >= 0) {
                if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        for (int valor : pares) {
            System.out.println(valor);
        }

        for (int valor : impares) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
