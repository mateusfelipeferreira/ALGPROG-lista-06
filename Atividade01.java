import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
