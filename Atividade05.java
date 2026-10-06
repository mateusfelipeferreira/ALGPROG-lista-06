import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {

                pares[contadorPares] = numeros[i];
                contadorPares++;

            } else {

                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        System.out.println("\nVetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nVetor PAR:");

        for (int i = 0; i < contadorPares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("\nVetor ÍMPAR:");

        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(impares[i]);
        }

        scanner.close();
    }
}
