import java.util.Scanner;

public class quartoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            
            int metadeDoTamanho = linha.length() / 2;
            
            String metadeEsquerda = linha.substring(0, metadeDoTamanho);
            String metadeDireita = linha.substring(metadeDoTamanho);
            
            String metadeEsquerdaInvertida = new StringBuilder(metadeEsquerda).reverse().toString();
            String metadeDireitaInvertida = new StringBuilder(metadeDireita).reverse().toString();
            
            System.out.println(metadeEsquerdaInvertida + metadeDireitaInvertida);
        }
    }
}
