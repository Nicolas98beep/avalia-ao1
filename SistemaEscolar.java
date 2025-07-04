import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Digite as 8 notas do aluno (1ª a 8ª):");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "ª Nota: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double[] mediasBimestre = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestre[i] = (notas[2 * i] + notas[2 * i + 1]) / 2.0;
        }

        // Cálculo das médias semestrais
        double[] mediasSemestre = new double[2];
        mediasSemestre[0] = (mediasBimestre[0] + mediasBimestre[1]) / 2.0;
        mediasSemestre[1] = (mediasBimestre[2] + mediasBimestre[3]) / 2.0;

        // Cálculo da média final
        double mediaFinal = (mediasSemestre[0] + mediasSemestre[1]) / 2.0;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dº Bimestre: %.1f%n", i + 1, mediasBimestre[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("%dº Semestre: %.1f%n", i + 1, mediasSemestre[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}