import java.util.ArrayList;
import java.util.Scanner;

public class Ex79 {
    public static void ex79Vetor() {
        double[] notas = new double[20];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o" + (i + 1) + "º nome");
            double notasInput = scanner.nextDouble();
            notas[i] = notasInput;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = (soma / notas.length);
        int acimaMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.println("A turma teve uma média de: " + media +" e " + acimaMedia +" alunos ficaram acima da média");
    }

    public static void ex79Array() {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o" + (i + 1) + "º nome");
            double notasInput = scanner.nextDouble();
            notas.add(notasInput);
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = (soma / notas.size());
        int acimaMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.println("A média da turma foi de: " + media +" e " + acimaMedia +" alunos ficaram acima da média");
    }
}
