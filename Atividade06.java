import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {

            double soma = 0;

            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();

                soma = soma + nota;
            }

            medias[i] = soma / 4;

            if (medias[i] >= 7) {
                aprovados++;
            }
        }

        System.out.println("Medias dos alunos:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("Quantidade de alunos com media maior ou igual a 7: " + aprovados);

        scanner.close();
    }
}
