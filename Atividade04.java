import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] caracteres = new char[10];
        int quantidadeConsoantes = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            caracteres[i] = scanner.next().charAt(0);
        }

        System.out.println("\nConsoantes encontradas:");

        for (int i = 0; i < 10; i++) {

            char caractere = caracteres[i];

            if (caractere != 'a' &&
                caractere != 'e' &&
                caractere != 'i' &&
                caractere != 'o' &&
                caractere != 'u') {

                quantidadeConsoantes++;

                System.out.println(caractere);
            }
        }

        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);

        scanner.close();
    }
}
