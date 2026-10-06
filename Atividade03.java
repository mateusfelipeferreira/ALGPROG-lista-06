import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();

            soma = soma + notas[i];
        }
        media = soma / 4;

        System.out.println("\nNotas digitadas:");

        for (int i = 0; i < 4; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Média: " + media);

        scanner.close();
    }
}
