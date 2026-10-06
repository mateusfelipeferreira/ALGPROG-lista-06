import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();

            soma = soma + numeros[i];

            multiplicacao = multiplicacao * numeros[i];
        }

        System.out.println("Numeros:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Soma: " + soma);

        System.out.println("Multiplicacao: " + multiplicacao);

        scanner.close();
    }
}
